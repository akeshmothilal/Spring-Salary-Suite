package com.interview.mapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.interview.model.User;

public class UserRowMapper  implements RowMapper <User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User user = new User();
		user.setUserId(rs.getLong("user_id"));
		user.setUserName(rs.getString("user_name"));
		user.setMobileNo(rs.getLong("mobile_no"));
		user.setUserPassword(rs.getString("user_password"));
		user.setEmail(rs.getString("email")); 
		
		return user;
	}

}
