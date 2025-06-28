package com.example.bouldertrack.repository;

import com.example.bouldertrack.models.ProgressReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ProgressReportRepository extends JpaRepository<ProgressReport,Long> {
    Optional<ProgressReport> findByUserIdAndWeekStart(Long userId, LocalDate weekStart);
}
