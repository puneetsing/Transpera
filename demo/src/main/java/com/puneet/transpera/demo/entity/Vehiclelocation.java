package com.puneet.transpera.demo.entity;
import java.time.LocalDateTime;
public class Vehiclelocation {


    private Long vehicleId;

    private Double latitude;

    private Double longitude;

    private Double speed;

    private Double accuracy;

    private LocalDateTime timestamp;

    private Integer batteryLevel;


    // =========================
    // CONSTRUCTORS
    // =========================

    public Vehiclelocation() {
    }


    public Vehiclelocation(
            Long vehicleId,
            Double latitude,
            Double longitude,
            Double speed,
            Double accuracy,
            LocalDateTime timestamp,
            Integer batteryLevel) {

        this.vehicleId = vehicleId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.speed = speed;
        this.accuracy = accuracy;
        this.timestamp = timestamp;
        this.batteryLevel = batteryLevel;
    }


    // =========================
    // GETTERS
    // =========================

    public Long getVehicleId() {
        return vehicleId;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getSpeed() {
        return speed;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Integer getBatteryLevel() {
        return batteryLevel;
    }


    // =========================
    // SETTERS
    // =========================

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setBatteryLevel(Integer batteryLevel) {
        this.batteryLevel = batteryLevel;
    }
} 
