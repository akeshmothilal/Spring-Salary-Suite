package com.interview.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.interview.model.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		
		employee.setEmployeeName(rs.getString("employee_name"));
		
		employee.setEmployeeId(rs.getLong("employee_id"));
		employee.setGender(rs.getString("gender"));
		employee.setMobileNo(rs.getLong("mobile_no"));
		employee.setDesingnation(rs.getString("desingnation"));
		employee.setEmail(rs.getString("email"));
		System.out.println("no of times called: "+employee);
		return employee;
	}

}
