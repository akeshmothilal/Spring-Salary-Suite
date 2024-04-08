package com.interview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.model.Salary;
import com.interview.repository.SalaryDAO;

@Service
public class SalaryService {
	@Autowired
	SalaryDAO salaryDAO;
	public void saveSalary(Salary salary) {
		salaryDAO.saveSalary(salary);
		
	}
	public void saveAttandance(int employeeId, int perDays) {
		salaryDAO.saveAttandance(employeeId, perDays);
	}
}
