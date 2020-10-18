package com.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Staff")
public class Staff {
	
	@Id
	String staffId;
	
	String staffName;
	String staffEmail;
	String staffDepartment;
	String staffDesignation;
	String staffMobileNo;
	String staffGender;
	
	public Staff() {
		
	}

	public Staff(String staffName, String staffEmail, String staffDepartment, String staffDesignation,
			String staffMobileNo, String staffGender) {
		this.staffName = staffName;
		this.staffEmail = staffEmail;
		this.staffDepartment = staffDepartment;
		this.staffDesignation = staffDesignation;
		this.staffMobileNo = staffMobileNo;
		this.staffGender = staffGender;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffEmail() {
		return staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public String getStaffDepartment() {
		return staffDepartment;
	}

	public void setStaffDepartment(String staffDepartment) {
		this.staffDepartment = staffDepartment;
	}

	public String getStaffDesignation() {
		return staffDesignation;
	}

	public void setStaffDesignation(String staffDesignation) {
		this.staffDesignation = staffDesignation;
	}

	public String getStaffMobileNo() {
		return staffMobileNo;
	}

	public void setStaffMobileNo(String staffMobileNo) {
		this.staffMobileNo = staffMobileNo;
	}

	public String getStaffGender() {
		return staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffEmail=" + staffEmail
				+ ", staffDepartment=" + staffDepartment + ", staffDesignation=" + staffDesignation + ", staffMobileNo="
				+ staffMobileNo + ", staffGender=" + staffGender + "]";
	}

}
