package com.example.employment.controller;

import com.example.employment.model.*;
import com.example.employment.service.CompensationService;
import com.example.employment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.YearMonth;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/compensation")
public class CompensationController {
    @Autowired
    private CompensationService compensationService;
    @Autowired
    private EmployeeService employeeService;

    // Show the Add Compensation form
    @GetMapping("/add/{uid}")
    public String addForm(@PathVariable String uid, Model model) {
        Employee emp = employeeService.getEmployeeById(uid).orElse(null);
        if (emp == null) {
            model.addAttribute("error", "Employee not found");
            return "compensation_add";
        }
        model.addAttribute("employee", emp);
        model.addAttribute("compensation", new Compensation());
        return "compensation_add";
    }

    // Process Add Compensation form
    @PostMapping("/add/{uid}")
    public String addCompensation(@PathVariable String uid, @ModelAttribute Compensation compensation, Model model) {
        Employee emp = employeeService.getEmployeeById(uid).orElse(null);
        if (emp == null) {
            model.addAttribute("error", "Employee not found");
            return "compensation_add";
        }
        compensation.setEmployee(emp);
        try {
            compensationService.addCompensation(compensation);
            model.addAttribute("message", "Compensation added successfully!");
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        model.addAttribute("employee", emp);
        model.addAttribute("compensation", new Compensation());
        return "compensation_add";
    }

    // Show compensation history for an employee
    @GetMapping("/history/{uid}")
    public String viewHistory(@PathVariable String uid, @RequestParam String start, @RequestParam String end, Model model) {
        Employee emp = employeeService.getEmployeeById(uid).orElse(null);
        if (emp == null) {
            model.addAttribute("error", "Employee not found");
            return "compensation_history";
        }
        Map<YearMonth, Double> history = compensationService.getCompensationHistory(emp, start, end);
        model.addAttribute("history", history);
        return "compensation_history";
    }

    // Show the Edit Compensation form
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        try {
            model.addAttribute("compensation", compensationService.getCompensationById(id));
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "compensation_edit";
    }

    // Process Edit Compensation form
    @PostMapping("/edit/{id}")
    public String editCompensation(@PathVariable Long id, @RequestParam Double amount, @RequestParam String description, Model model) {
        try {
            compensationService.updateCompensationAmountAndDescription(id, amount, description);
            model.addAttribute("message", "Compensation updated successfully!");
            model.addAttribute("compensation", compensationService.getCompensationById(id));
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "compensation_edit";
    }
}