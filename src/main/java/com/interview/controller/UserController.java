package com.interview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.interview.model.Employee;
import com.interview.model.User;
import com.interview.service.EmployeeService;
import com.interview.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/user")
	public String getHomepage() {
		return "index";
	}

	@GetMapping("/showUserRegistration")
	public String showRegistrationForm() {
		return "user-registration-form";
	}

	@PostMapping("/userRegister")
	public ModelAndView userRegister( User user) {
		ModelAndView mv = new ModelAndView();

		System.out.println(user);
		userService.userRegister(user);
	List<Employee> employeeList =	employeeService.getAllEmployee();
	mv.addObject("employeeList", employeeList);
		mv.setViewName("employee-salary");
		return mv;

	}
	@PostMapping("/userLogin")
	public ModelAndView userLogin(@ModelAttribute User user) {
		System.out.println(user);
		ModelAndView mv =new ModelAndView();
		String message ;
		List<User> userResult = userService.userLogin(user);
		System.out.println(user);
		System.out.println(userResult);
		if(!userResult.isEmpty()) {
			List<Employee> employeeList = employeeService.getAllEmployee();
			System.out.println(employeeList);
			mv.setViewName("employee-salary");
			mv.addObject("employeeList", employeeList);
			return mv;


	}
	else {
		
		message = "invalid cruditials";
		mv.setViewName("index");
		mv.addObject("message",message);
		return mv;

	}

}
}
