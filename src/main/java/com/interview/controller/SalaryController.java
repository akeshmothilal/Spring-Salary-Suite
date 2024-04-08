package com.interview.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.interview.model.Employee;
import com.interview.model.Salary;
import com.interview.service.EmployeeService;
import com.interview.service.SalaryService;

@Controller
public class SalaryController {
	@Autowired
	private SalaryService salaryService;
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/saveSalary")
	public ModelAndView saveSalary(@ModelAttribute Salary salary){
		System.out.println(salary);
		ModelAndView mv = new ModelAndView();
		
		
		salaryService.saveSalary(salary);
		List<Employee> empoyeeList = employeeService.getAllEmployee();
		mv.addObject("employeeList", empoyeeList);
		mv.addObject("message", "suessfully saved");

		mv.setViewName("employee-salary");
		return mv;
		
	}
	@PostMapping("/saveAttandance")
	public ModelAndView saveAttandance(@RequestParam int employeeId,@RequestParam int perDays) {
		System.out.println(employeeId+" " +perDays);
		salaryService.saveAttandance(employeeId, perDays);
		ModelAndView mv = new ModelAndView();
		List<Employee> empoyeeList = employeeService.getAllEmployee();
		mv.addObject("employeeList", empoyeeList);
		mv.addObject("message", "suessfully saved");
		mv.setViewName("employee-salary");
		return mv;
		
		
		
	}
}
