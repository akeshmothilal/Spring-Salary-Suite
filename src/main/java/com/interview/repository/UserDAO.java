package com.interview.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.interview.mapper.UserRowMapper;
import com.interview.model.User;

@Repository
public class UserDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void userRegister(User user) {
		String sqlQuery = "insert into user_info (user_name,email,user_password,mobile_no) values (?,?,?,?)";

		Object[] parameterValues = { user.getUserName(), user.getEmail(), user.getUserPassword(), user.getMobileNo() };

		int result = jdbcTemplate.update(sqlQuery, parameterValues);
		System.out.println(result);

	}

	public List<User> userLogin(User user) {

		String sqlQuery = "select * from user_info where user_name = ? and user_password = ?";

		List<User> userResult = jdbcTemplate.query(sqlQuery, new UserRowMapper(), user.getUserName(),
				user.getUserPassword());

		return userResult;

	}
	
	
	

}
