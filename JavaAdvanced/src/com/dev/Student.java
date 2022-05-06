package com.dev;

import java.util.Objects;

public class Student {
	
	private String id;
	private String rollNumber; 
	private String name;
	private int age;
	private String email;
	private String courseName; 
	private String address;
	private double submittedFees;
	private String prevEducation;
	private String resultStatus;
	private int attendance;
	private double totalCourseFees;
	private int durationOfCourse; 
	private String feeStatus;
	private String courseYear;
	
	public String getId() { 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) { 
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {  
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSubmittedFees() {
		return submittedFees; 
	}
	public void setSubmittedFees(double submittedFees) { 
		this.submittedFees = submittedFees;
	}
	public String getPrevEducation() {
		return prevEducation;
	}
	public void setPrevEducation(String prevEducation) {
		this.prevEducation = prevEducation;
	}
	public String getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public double getTotalCourseFees() {
		return totalCourseFees;
	}
	public void setTotalCourseFees(double totalCourseFees) { 
		this.totalCourseFees = totalCourseFees;
	}
	public int getDurationOfCourse() {
		return durationOfCourse;
	}
	public void setDurationOfCourse(int durationOfCourse) {
		this.durationOfCourse = durationOfCourse;
	}
	public String getFeeStatus() {
		return feeStatus;
	}
	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}
	public String getCourseYear() {
		return courseYear;
	}
	public void setCourseYear(String courseYear) { 
		this.courseYear = courseYear;
	} 
	
	public int hashCode() {
		return Objects.hash(id); 
	}
	
	public boolean equals(Object ob) {
		if (this == ob)
			return true;
		if (ob == null)
			return false;
		if (getClass() != ob.getClass())
			return false;
		Student other = (Student) ob;
		return Objects.equals(id, other.id); 
	}
	
	public String toString()  
	{
		return  "Student [id=" + id + ", rollNo=" + rollNumber + ", name=" + name + ", age=" + age + ", email=" + email
				+ ", course=" + courseName + ", address=" + address + ", prevEducation=" + prevEducation
				+ ", submittedFees=" + submittedFees + ", totalCourseFees=" + totalCourseFees + ", courseFeeStatus="
				+ feeStatus + ", resultStatus=" + resultStatus + ", courseDuration=" + durationOfCourse
				+ ", attendance=" + attendance + ", admissionYear=" + courseYear; 
	}
	
}
