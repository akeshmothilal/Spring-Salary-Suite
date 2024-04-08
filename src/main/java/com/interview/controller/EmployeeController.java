package com.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.interview.model.Employee;
import com.interview.service.EmployeeService;
import com.interview.service.ResponseService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/showEmployeeRegistration")
	public String showRegistrationForm() {
		return "employee-registration-form";
	}
	@PostMapping("/employeeRegister")
	public ModelAndView employeeRegistration(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		System.out.println(employee);
		employeeService.employeeRegister(employee);
		mv.setViewName("employee-registration-form");
		mv.addObject("message", "Suessfully registred! ");
		return mv;
		
		
	}

}
