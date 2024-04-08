package com.interview.model;

public class Response {
	private long employeeId;
	private String employeeName;
	private int perDays;
	private long gross;
	private long basic;
	private long HRA;
	private long va;
	private long total;
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getPerDays() {
		return perDays;
	}
	public void setPerDays(int perDays) {
		this.perDays = perDays;
	}
	public long getGross() {
		return gross;
	}
	public void setGross(long gross) {
		this.gross = gross;
	}
	public long getBasic() {
		return basic;
	}
	public void setBasic(long basic) {
		this.basic = basic;
	}
	public long getHRA() {
		return HRA;
	}
	public void setHRA(long hRA) {
		HRA = hRA;
	}
	public long getVa() {
		return va;
	}
	public void setVa(long va) {
		this.va = va;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Response [employeeId=" + employeeId + ", employeeName=" + employeeName + ", perDays=" + perDays
				+ ", gross=" + gross + ", basic=" + basic + ", HRA=" + HRA + ", va=" + va + ", total=" + total + "]";
	}
	
	

}
//select e.employee_id ,e.employee_name ,a.per_days,s.gross,s.basic,s.HRA,s.va,s.total from employee e,salary s,attandance  a where e.employee_id=s.employee_id and e.employee_id=a.employee_id;
