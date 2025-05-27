package com.ibm.springmvcjpa1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.springmvcjpa1.entity.Department;
import com.ibm.springmvcjpa1.service.DepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	public String listDepartments(Model model) {
		model.addAttribute("department", departmentService.getAllDepartments());
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
		departmentService.saveDepartment(department);
		return "redirect:/departments";
	}
	
	@GetMapping("/edit/{id}")
	public String editDepartment(@PathVariable Long id, Model model) {
		model.addAttribute("department", departmentService.getDepartmentById(id));
		return "department/form";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteDepartment(@PathVariable Long id) {
		departmentService.deleteDepartment(id);
		return "redirect:/departments";
	}
}
