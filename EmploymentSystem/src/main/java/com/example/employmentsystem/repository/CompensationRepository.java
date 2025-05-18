package com.example.employmentsystem.repository;

import java.time.YearMonth;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employmentsystem.entity.Compensation;
import com.example.employmentsystem.entity.Employee;

public interface CompensationRepository extends JpaRepository<Compensation, Long> {
    List<Compensation> findByEmployeeAndDateBetween(Employee employee, YearMonth start, YearMonth end);
    List<Compensation> findByEmployeeAndDate(Employee employee, YearMonth date);
}