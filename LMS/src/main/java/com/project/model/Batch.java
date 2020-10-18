package com.project.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Batches")
public class Batch {
	
	@Id
	String batchId;
	
	String batchName;
	String batchYear;
	String feePerStudent;
	String numberOfStudents;
	String feeStatus;
	String staff;
	
	public Batch() {
		
	}
	
	public Batch(String batchName, String batchYear, String feePerStudent, String numberOfStudents, String feeStatus,
			String staff) {
		this.batchName = batchName;
		this.batchYear = batchYear;
		this.feePerStudent = feePerStudent;
		this.numberOfStudents = numberOfStudents;
		this.feeStatus = feeStatus;
		this.staff = staff;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchYear() {
		return batchYear;
	}

	public void setBatchYear(String batchYear) {
		this.batchYear = batchYear;
	}

	public String getFeePerStudent() {
		return feePerStudent;
	}

	public void setFeePerStudent(String feePerStudent) {
		this.feePerStudent = feePerStudent;
	}

	public String getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(String numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getFeeStatus() {
		return feeStatus;
	}

	public void setFeeStatus(String feeStatus) {
		this.feeStatus = feeStatus;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

}
