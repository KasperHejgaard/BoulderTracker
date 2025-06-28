package com.example.bouldertrack.repository;

import com.example.bouldertrack.models.FingerTraining;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FingerTrainingRepository extends JpaRepository<FingerTraining,Long> {
    List<FingerTraining> findByUserId(Long userId);
}
