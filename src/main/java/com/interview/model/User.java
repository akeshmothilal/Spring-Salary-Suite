package com.interview.model;

public class User {
 private long userId;
 private String  userName;
 private String userPassword;
 private long mobileNo;
 private String email;
public long getUserId() {
	return userId;
}
public void setUserId(long userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getUserPassword() {
	return userPassword;
}
public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
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
	return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", mobileNo="
			+ mobileNo + ", email=" + email + "]";
}

 
 
 
 
 
}
