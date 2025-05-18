package com.example.employment.controller;

import com.example.employment.model.Employee;
import com.example.employment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee_add";
    }

    @PostMapping("/add")
    public String addEmployee(@ModelAttribute Employee employee, Model model) {
        try {
            employeeService.addEmployee(employee);
            model.addAttribute("message", "Employee added successfully!");
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "employee_add";
    }

    @GetMapping("/search")
    public String searchForm() {
        return "employee_search";
    }

    @PostMapping("/search")
    public String searchEmployees(@RequestParam(required = false) String firstName,
                                  @RequestParam(required = false) String lastName,
                                  @RequestParam(required = false) String position,
                                  Model model) {
        List<Employee> results = employeeService.searchEmployees(firstName, lastName, position);
        model.addAttribute("results", results);
        return "employee_search";
    }

    @GetMapping("/edit/{uid}")
    public String editForm(@PathVariable String uid, Model model) {
        Employee emp = employeeService.getEmployeeById(uid).orElse(null);
        model.addAttribute("employee", emp);
        return "employee_edit";
    }

    @PostMapping("/edit/{uid}")
    public String editEmployee(@PathVariable String uid, @ModelAttribute Employee employee, Model model) {
        try {
            employee.setUid(uid);
            employeeService.updateEmployee(employee);
            model.addAttribute("message", "Employee updated successfully!");
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "employee_edit";
    }
}