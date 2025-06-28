package com.example.bouldertrack.repository;

import com.example.bouldertrack.models.TrainingPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface TrainingPlanRepository extends JpaRepository<TrainingPlan,Long> {
    Optional<TrainingPlan> findByUserIdAndWeekStart(Long userId, LocalDate weekStart);
}
