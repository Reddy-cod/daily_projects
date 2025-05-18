package com.example.employment.service;

import com.example.employment.model.*;
import com.example.employment.repository.CompensationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.YearMonth;
import java.util.*;

@Service
public class CompensationService {
    @Autowired
    private CompensationRepository compensationRepository;

    public Compensation addCompensation(Compensation comp) throws Exception {
        switch (comp.getType()) {
            case SALARY:
                if (comp.getAmount() == null) throw new Exception("Amount required");
                if (compensationRepository.existsByEmployeeAndTypeAndPayPeriod(
                        comp.getEmployee(), CompensationType.SALARY, comp.getPayPeriod())) {
                    throw new Exception("Only one salary entry per employee per month");
                }
                break;
            case BONUS:
            case COMMISSION:
            case ALLOWANCE:
                if (comp.getAmount() == null || comp.getAmount() <= 0) throw new Exception("Amount must be > 0");
                if (comp.getDescription() == null || comp.getDescription().isEmpty())
                    throw new Exception("Description is required");
                break;
            case ADJUSTMENT:
                if (comp.getAmount() == null || comp.getAmount() == 0) throw new Exception("Amount cannot be zero");
                if (comp.getDescription() == null || comp.getDescription().isEmpty())
                    throw new Exception("Description is required");
                break;
        }
        return compensationRepository.save(comp);
    }

    public Map<YearMonth, Double> getCompensationHistory(Employee emp, String start, String end) {
        List<Compensation> all = compensationRepository.findByEmployeeAndPayPeriodBetween(emp, start, end);
        Map<YearMonth, Double> totals = new TreeMap<>();
        for (Compensation comp : all) {
            YearMonth ym = YearMonth.parse(comp.getPayPeriod());
            totals.put(ym, totals.getOrDefault(ym, 0.0) + comp.getAmount());
        }
        return totals;
    }

    public List<Compensation> getMonthlyBreakdown(Employee emp, String month) {
        return compensationRepository.findByEmployeeAndPayPeriod(emp, month);
    }

    public Compensation updateCompensationAmountAndDescription(Long id, Double amt, String desc) throws Exception {
        Compensation comp = compensationRepository.findById(id).orElseThrow(() -> new Exception("Not found"));
        switch (comp.getType()) {
            case SALARY:
                comp.setAmount(amt);
                break;
            case BONUS:
            case COMMISSION:
            case ALLOWANCE:
            case ADJUSTMENT:
                if (amt == null || (comp.getType() == CompensationType.ADJUSTMENT ? amt == 0 : amt <= 0))
                    throw new Exception("Invalid amount");
                if (desc == null || desc.isEmpty()) throw new Exception("Description required");
                comp.setAmount(amt);
                comp.setDescription(desc);
                break;
        }
        return compensationRepository.save(comp);
    }

    public Compensation getCompensationById(Long id) throws Exception {
        return compensationRepository.findById(id).orElseThrow(() -> new Exception("Compensation not found"));
    }
}