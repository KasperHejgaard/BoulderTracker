package com.example.bouldertrack.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private String name;
    private String email;
    private double weight;
    private double height;
    private double bmi;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<TrainingSession> trainingSessions;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<FingerTraining> fingerTrainings;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ProgressReport> progressReports;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<TrainingPlan> trainingPLans;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MaxPullUp> maxPullUps;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public List<TrainingSession> getTrainingSessions() {
        return trainingSessions;
    }

    public void setTrainingSessions(List<TrainingSession> trainingSessions) {
        this.trainingSessions = trainingSessions;
    }

    public List<FingerTraining> getFingerTrainings() {
        return fingerTrainings;
    }

    public void setFingerTrainings(List<FingerTraining> fingerTrainings) {
        this.fingerTrainings = fingerTrainings;
    }

    public List<ProgressReport> getProgressReports() {
        return progressReports;
    }

    public void setProgressReports(List<ProgressReport> progressReports) {
        this.progressReports = progressReports;
    }

    public List<TrainingPlan> getTrainingPLans() {
        return trainingPLans;
    }

    public void setTrainingPLans(List<TrainingPlan> trainingPLans) {
        this.trainingPLans = trainingPLans;
    }

    public List<MaxPullUp> getMaxPullUps() {
        return maxPullUps;
    }

    public void setMaxPullUps(List<MaxPullUp> maxPullUps) {
        this.maxPullUps = maxPullUps;
    }
}
