package com.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Students")
public class Student {
	
	@Id
	String studentId;
	
	String registrationNumber;
	String studentName;
	String studentEmail;
	String studentMobileNo;
	String studentDateOfBirth;
	String studentAdmiDate;
	String studentGender;
	
	public Student() {
		
	}
	
	public Student(String registrationNumber, String studentName, String studentEmail,
			String studentMobileNo, String studentDateOfBirth, String studentAdmiDate, String studentGender) {
		this.registrationNumber = registrationNumber;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentMobileNo = studentMobileNo;
		this.studentDateOfBirth = studentDateOfBirth;
		this.studentAdmiDate = studentAdmiDate;
		this.studentGender = studentGender;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentMobileNo() {
		return studentMobileNo;
	}

	public void setStudentMobileNo(String studentMobileNo) {
		this.studentMobileNo = studentMobileNo;
	}

	public String getStudentDateOfBirth() {
		return studentDateOfBirth;
	}

	public void setStudentDateOfBirth(String studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}

	public String getStudentAdmiDate() {
		return studentAdmiDate;
	}

	public void setStudentAdmiDate(String studentAdmiDate) {
		this.studentAdmiDate = studentAdmiDate;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

}
