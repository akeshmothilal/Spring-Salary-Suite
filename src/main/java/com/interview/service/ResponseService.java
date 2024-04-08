package com.interview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.interview.model.Response;
import com.interview.repository.ResponseDAO;

@Service
public class ResponseService {
	@Autowired
	ResponseDAO responseDAO;
	
	public List<Response> getAllResponses (){
		return responseDAO.getAllResponse();
	}

}
