package com.interview.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.interview.mapper.EmployeeRowMapper;
import com.interview.model.Employee;
@Repository
public class EmployeeDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void employeeRegiste(Employee employee) {
		String sqlQuery = "insert into employee (employee_name,gender ,mobile_no, email,desingnation ) values(?, ?, ?, ?,?)";
         Object[] parameterValues = {employee.getEmployeeName(), employee.getGender(), employee.getMobileNo(), employee.getEmail(), employee.getDesingnation()};
         int result = jdbcTemplate.update(sqlQuery, parameterValues);
	}
      
	public  List<Employee> getAllEmployee(){
		String sql = "select * from employee";
		List<Employee> employees =jdbcTemplate.query(sql,new  EmployeeRowMapper());
		System.out.println(employees.getClass());
		return employees;
		
		
		
	}
	
}
