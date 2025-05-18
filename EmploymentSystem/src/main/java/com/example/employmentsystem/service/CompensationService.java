package com.example.employmentsystem.service;

import com.example.employmentsystem.entity.Compensation;
import com.example.employmentsystem.entity.Employee;
import com.example.employmentsystem.repository.CompensationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.List;

@Service
public class CompensationService {
    @Autowired
    private CompensationRepository compensationRepository;

    public Compensation addCompensation(Compensation compensation) {
        // Validation logic per user stories goes here
        return compensationRepository.save(compensation);
    }

    public List<Compensation> getCompensationHistory(Employee employee, YearMonth start, YearMonth end) {
        return compensationRepository.findByEmployeeAndDateBetween(employee, start, end);
    }

    public List<Compensation> getCompensationForMonth(Employee employee, YearMonth date) {
        return compensationRepository.findByEmployeeAndDate(employee, date);
    }
}