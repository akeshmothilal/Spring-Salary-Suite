package com.interview.model;

public class Salary {
	private long salaryId;
	private long gross;
	private long basic;
	private long HRA;
	private long va;
	private long total;
	private long employeeId;
	public long getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(long salaryId) {
		this.salaryId = salaryId;
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
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Salary [salaryId=" + salaryId + ", gross=" + gross + ", basic=" + basic + ", HRA=" + HRA + ", va=" + va
				+ ", total=" + total + ", employeeId=" + employeeId + "]";
	}
 

}
