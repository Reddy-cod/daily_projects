package com.ibm.springmvcjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.springmvcjpa.entities.Employee;
import com.ibm.springmvcjpa.service.DepartmentService;
import com.ibm.springmvcjpa.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
   @Autowired
   private EmployeeService employeeService;
   
   @Autowired
   private DepartmentService departmentService;
   
   @GetMapping
   public String listEmployees(Model model) {
	   model.addAttribute("employees", employeeService.getAllEmployees());
	   return "employee/list";
   }
   
   @GetMapping
   public String showEmployeeForm(Model model) {
	   model.addAttribute("employees",new Employee());
	   model.addAttribute("departments",departmentService.getAllDepartments());
	   return "employee/form";
   }
   
   @PostMapping("/save")
   public String saveEmployee(@ModelAttribute Employee employee) {
  	 employeeService.saveEmployee(employee);
  	 return "redirect/employee";
   }
   
   @PostMapping("/edit/save")
   public String updateEmployee(@ModelAttribute Employee employee) {
  	 employeeService.saveEmployee(employee);
  	 return "redirect:/employee";
   }
   @GetMapping("edit/{id}")
   public String editEmployee(@PathVariable long id,Model model) {
  	 model.addAttribute("employee",employeeService.getEmployeeById(id));
  	 model.addAttribute("department",departmentService.getDepartmentById(id));
  	 return "employee/form";
   }
   @GetMapping("/delete/{id}")
   public String deleteEmployee(@PathVariable long id) {
  	 employeeService.deleteEmployee(id);
  	 return "redirect:/employee";
   }
   
   @GetMapping("/department/{departmentId}")
   public String listEmployeesByDepartment(@PathVariable Long departmentid,Model model) {
	   model.addAttribute("employees",employeeService.getEmployeeById(departmentid));
	   return "employee/list";
   }
   
}
