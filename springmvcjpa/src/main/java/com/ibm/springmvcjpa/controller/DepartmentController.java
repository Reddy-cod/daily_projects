package com.ibm.springmvcjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ibm.springmvcjpa.entities.Department;
import com.ibm.springmvcjpa.service.DepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public String listDepartments(Model model) {
        model.addAttribute("departments", departmentService.getAllDepartments());
        return "department/list";
    }

    @GetMapping("/new")
    public String showDepartmentForm(Model model) {
        model.addAttribute("department", new Department());
        return "department/form";
    }

    @PostMapping("/save")
    public String saveDepartment(@ModelAttribute Department department) {
        departmentService.saveDepartment(department);
        return "redirect:/departments";
    }

    @PostMapping("/edit/save")
    public String updateDepartment(@ModelAttribute Department department) {
        departmentService.updateDepartment(department.getId(), department);
        return "redirect:/departments";
    }

    @GetMapping("/edit/{id}")
    public String editDepartment(@PathVariable long id, Model model) {
        model.addAttribute("department", departmentService.getDepartmentById(id));
        return "department/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteDepartment(@PathVariable long id) {
        departmentService.deleteDepartment(id);
        return "redirect:/departments";
    }
}