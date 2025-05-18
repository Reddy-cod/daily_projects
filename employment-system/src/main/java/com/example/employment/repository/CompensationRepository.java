package com.example.employment.repository;

import com.example.employment.model.Compensation;
import com.example.employment.model.Employee;
import com.example.employment.model.CompensationType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CompensationRepository extends JpaRepository<Compensation, Long> {
    List<Compensation> findByEmployeeAndPayPeriodBetween(Employee employee, String start, String end);
    List<Compensation> findByEmployeeAndPayPeriod(Employee employee, String payPeriod);
    boolean existsByEmployeeAndTypeAndPayPeriod(Employee employee, CompensationType type, String payPeriod);
}