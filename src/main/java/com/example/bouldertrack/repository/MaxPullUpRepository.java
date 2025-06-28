package com.example.bouldertrack.repository;

import com.example.bouldertrack.models.MaxPullUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaxPullUpRepository extends JpaRepository<MaxPullUp,Long> {
    List<MaxPullUp> findByUserId(Long userId);
}
