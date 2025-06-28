package com.example.bouldertrack.models;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class FingerTraining {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private LocalDate date;
    private int holdSizeMm;
    private int durationSeconds;
    private int sets;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHoldSizeMm() {
        return holdSizeMm;
    }

    public void setHoldSizeMm(int holdSizeMm) {
        this.holdSizeMm = holdSizeMm;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
