package com.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.model.User;
import com.interview.repository.UserDAO;
@Service
public class UserService {
	@Autowired
	UserDAO userDAO;
	public void userRegister(User user) {
		userDAO.userRegister(user);
	}
	
	
	public List<User> userLogin(User user) {
		return userDAO.userLogin(user);
	}
}
