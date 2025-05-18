package com.example.employment.repository;

import com.example.employment.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    boolean existsByFirstNameAndMiddleNameAndLastNameAndBirthDate(
            String firstName, String middleName, String lastName, LocalDate birthDate);

    List<Employee> findByFirstNameContainingIgnoreCaseAndLastNameContainingIgnoreCaseAndPositionContainingIgnoreCase(
            String firstName, String lastName, String position);
}