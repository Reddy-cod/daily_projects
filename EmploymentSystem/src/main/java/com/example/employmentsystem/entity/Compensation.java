package com.example.employmentsystem.entity;

import java.time.YearMonth;

import com.sun.istack.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Compensation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Employee employee;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CompensationType type;

    @NotNull
    private Double amount;

    private String description;

    @NotNull
    private YearMonth date; // e.g. 2025-05

    // Getters and setters

    public enum CompensationType {
        SALARY, BONUS, COMMISSION, ALLOWANCE, ADJUSTMENT
    }
}