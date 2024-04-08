package com.interview.service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.interview.model.Response;

@Service
public class ExcelService {
	
	
	
	public String createExcel(List<Response> responses) throws IOException {
		XSSFWorkbook webook = new XSSFWorkbook();
		XSSFSheet sheet = webook.createSheet("response");
		
		String [] headers = {"Employee Id, EmployeeName, PerDays, Gross, HRA, Variable, Total"};
		Row headerRow  = sheet.createRow(0);
		 
		
		for(int col = 0; col<headers.length; col++) {
			Cell cell = headerRow.createCell(col);
			cell.setCellValue(headers[col]);
			
		}
		
		int rowCount = 1;
		
		for(Response res : responses ) {
			XSSFRow row = sheet.createRow(rowCount++);
			row.createCell(0).setCellValue(res.getEmployeeId()); 
			row.createCell(1).setCellValue(res.getEmployeeName()); 
			row.createCell(2).setCellValue(res.getPerDays());
			row.createCell(3).setCellValue(res.getGross()); 
			row.createCell(4).setCellValue(res.getHRA()); 
			row.createCell(5).setCellValue(res.getVa());
			row.createCell(6).setCellValue(res.getTotal()); 






		}
		FileOutputStream file = new FileOutputStream(".//excel//response.xlsx");
		

		webook.write(file);
		
		webook.close();
		file.close();
		

		
		
		return "file is written in excel";

	}
	
	

}
