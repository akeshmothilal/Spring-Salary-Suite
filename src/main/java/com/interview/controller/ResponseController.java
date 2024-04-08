package com.interview.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.interview.model.Response;
import com.interview.service.ExcelService;
import com.interview.service.ExcelServiceDownload;
import com.interview.service.ResponseService;

@Controller
public class ResponseController {
	@Autowired
	ResponseService responseService;
	@Autowired
	ExcelService excelService;
	@Autowired
	ExcelServiceDownload excelDownload;
	@GetMapping("/showinfo")
	public ModelAndView getResponses(HttpServletResponse response) throws IOException {
		List<Response> responses = responseService.getAllResponses();
		System.out.println(responses);
		String excelResponse  = excelService.createExcel(responses);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("responseList", responses);
		mv.addObject("excelResponse", excelResponse);
		mv.setViewName("info");
		return mv;
		
	}
	
	
	@GetMapping("/showexcel")
	public void downloadExcel(HttpServletResponse response) throws IOException {
		List<Response> responses = responseService.getAllResponses();
		System.out.println(responses);
	 excelDownload.downloadExcel(response, responses);

	}

}
