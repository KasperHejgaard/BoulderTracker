package com.example.bouldertrack.repository;

import com.example.bouldertrack.models.TrainingSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TrainingSessionRepository extends JpaRepository<TrainingSession, Long> {

    List<TrainingSession> findByUserId(Long userId);
    List<TrainingSession> findByUserAndDateBetween(Long userId, LocalDate start, LocalDate end);

}
