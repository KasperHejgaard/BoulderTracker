package com.example.bouldertrack.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ProgressReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private LocalDate weekStart;
    private String summary;
    private double strengthScore;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public LocalDate getWeekStart() {
        return weekStart;
    }

    public void setWeekStart(LocalDate weekStart) {
        this.weekStart = weekStart;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double getStrengthScore() {
        return strengthScore;
    }

    public void setStrengthScore(double strengthScore) {
        this.strengthScore = strengthScore;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
