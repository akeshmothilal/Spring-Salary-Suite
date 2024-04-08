package com.interview.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.interview.model.Salary;
@Repository
public class SalaryDAO {
	@Autowired
	public JdbcTemplate jdbcTemplate;
	
	public void saveSalary(Salary salary ) {
		String sql = "insert into salary(gross,basic, HRA, va, total, employee_id)values(?, ?, ?, ?, ?,?)";
		Object[] parameterValues = {salary.getGross(), salary.getBasic(), salary.getHRA(), salary.getVa(), salary.getTotal(), salary.getEmployeeId()};
		int result = jdbcTemplate.update(sql, parameterValues);
		System.out.println(result);
	}
	
	public void saveAttandance(int employeeId, int perDays) {
		
		
		String sqlQuery = "insert into attandance(employee_id, per_days )values(?,?)";
		
		int result = jdbcTemplate.update(sqlQuery, employeeId, perDays);
		
		
		
	}

}
