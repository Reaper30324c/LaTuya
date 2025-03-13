package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "requestTable")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRequest")
    private Integer idRequest;
    private String status;
    private LocalDate dateRequest;
    @Column(length = 10,nullable = false)
    private double amount;

    public Request(Integer idRequest, Integer idUser, Integer idRestaurant, String status, LocalDate dateRequest, double amount) {
        this.idRequest = idRequest;
        this.status = status;
        this.dateRequest = dateRequest;
        this.amount = amount;
    }

    public Request() {
    }

    public Integer getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(Integer idRequest) {
        this.idRequest = idRequest;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getDateRequest() {
        return dateRequest;
    }

    public void setDateRequest(LocalDate dateRequest) {
        this.dateRequest = dateRequest;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
