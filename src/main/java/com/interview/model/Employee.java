package com.interview.model;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String gender;
	private String desingnation;
	private long mobileNo;
	private String email;
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employee_id) {
		this.employeeId = employee_id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesingnation() {
		return desingnation;
	}
	public void setDesingnation(String desingnation) {
		this.desingnation = desingnation;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", desingnation=" + desingnation + ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}
	
	
	
	
}
