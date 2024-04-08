package com.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.model.Employee;
import com.interview.repository.EmployeeDAO;
@Service
public class EmployeeService {
	@Autowired
	 EmployeeDAO employeeDAO;
	public void employeeRegister(Employee employee) {
		employeeDAO.employeeRegiste(employee);
	}
	
	public List<Employee> getAllEmployee(){
	return	employeeDAO.getAllEmployee();
	}

}
