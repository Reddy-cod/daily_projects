package com.example.employmentsystem.repository;

import com.example.employmentsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    boolean existsByFirstNameAndMiddleNameAndLastNameAndBirthDate(
        String firstName, String middleName, String lastName, java.time.LocalDate birthDate
    );
    List<Employee> findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndPositionContainingIgnoreCase(
        String firstName, String lastName, String position
    );
}