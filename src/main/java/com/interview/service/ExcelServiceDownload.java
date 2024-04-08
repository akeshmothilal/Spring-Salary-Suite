package com.interview.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import com.interview.model.Response;

@Service
public class ExcelServiceDownload {
	
    public void downloadExcel(HttpServletResponse response, List<Response> responses) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("response");

        String[] headers = {"Employee Id", "EmployeeName", "PerDays", "Gross", "HRA", "Variable", "Total"};
        XSSFRow headerRow = sheet.createRow(0);

        for (int col = 0; col < headers.length; col++) {
            Cell cell = headerRow.createCell(col);
            cell.setCellValue(headers[col]);
        }

        int rowCount = 1;

        for (Response res : responses) {
            XSSFRow row = sheet.createRow(rowCount++);
            row.createCell(0).setCellValue(res.getEmployeeId());
            row.createCell(1).setCellValue(res.getEmployeeName());
            row.createCell(2).setCellValue(res.getPerDays());
            row.createCell(3).setCellValue(res.getGross());
            row.createCell(4).setCellValue(res.getHRA());
            row.createCell(5).setCellValue(res.getVa());
            row.createCell(6).setCellValue(res.getTotal());
        }

        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment; filename=\"response.xlsx\"");
System.out.println(response.getOutputStream());
System.out.println(response.getCharacterEncoding());
System.out.println(response.getContentType());
        workbook.write(response.getOutputStream());
        workbook.close();
    }


}
