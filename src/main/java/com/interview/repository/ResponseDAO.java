package com.interview.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.interview.model.Response;
@Repository
public class ResponseDAO {
	@Autowired
  JdbcTemplate jdbcTemplate;
	public List<Response> getAllResponse(){
		String sql= "select e.employee_id ,e.employee_name ,a.per_days,s.gross,s.basic,s.HRA,s.va,s.total from employee e,salary s,attandance  a where e.employee_id=s.employee_id and e.employee_id=a.employee_id";
		
		List<Response> responses = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Response>(Response.class));
		return responses;
	}
  
}
