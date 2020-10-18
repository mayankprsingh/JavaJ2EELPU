package com.project.lms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.lms.repository.batchRepository;
import com.project.lms.repository.staffRepository;
import com.project.lms.repository.studentRepository;
import com.project.model.Batch;
import com.project.model.Staff;
import com.project.model.Student;

@Controller
@RequestMapping("/lms")
public class LMSController {
	
	@Autowired
	staffRepository staffRepository;
	
	@Autowired
	studentRepository studentRepository;
	
	@Autowired
	batchRepository batchRepository;
	
	@GetMapping("/login")
	public String login(@RequestParam String adminEmail, @RequestParam String adminPassword){
		if(adminEmail.equals("admin@lms.in")&&adminPassword.equals("147258")) {
			try {
				return "redirect:dashboard";
			}catch (Exception e) {
				return "redirect:error";
			}
		}else {
			return "redirect:invalid";
		}
		
	}
	
	@GetMapping("/dashboard")
	public String welcome() {
		
		return "dashboard.html";
	}
	
	@GetMapping("/logout") 
	public String logout() {
		return "login.html";
	} 
	
	@GetMapping("/invalid")
	public String invalid() {
		
		return "invalid.html";
	}
	
	@GetMapping("/error")
	public String error() {
		
		return "error.html";
	}
	
	@GetMapping("/clickAddStaff")
	public String clickAddStaff() {
		
		return "addStaff.html";
	}
	
	@PostMapping("/addStaff")
	public String addStaff(@RequestParam String staffName, @RequestParam String staffEmail, @RequestParam String staffDepartment, @RequestParam String staffDesignation, @RequestParam String staffMobileNo, @RequestParam String staffGender){
		try {
			Staff staffRef = staffRepository.save(new Staff(staffName, staffEmail, staffDepartment, staffDesignation, staffMobileNo, staffGender));
			return "redirect:listStaff";
		}catch (Exception e) {
			return "redirect:listStaff";
		}
	}
	
	@GetMapping("/listStaff")
	public String listStaff(Model model){
		
		try {
			
			model.addAttribute("staffList", staffRepository.findAll());
	        return "listStaff.html";
		}catch(Exception e) {
			return "dashboard.html";
		}
	}
	
	@GetMapping("/clickStaffUpdate")
	public String clickStaffUpdate() {
		
		return "updateStaff.html";
	}
	
	@GetMapping("/updateStaff/{id}")
	public String updateStaff(@PathVariable("id") String staffId, @RequestParam String staffName, @RequestParam String staffEmail, @RequestParam String staffDepartment, @RequestParam String staffDesignation, @RequestParam String staffMobileNo, @RequestParam String staffGender){
		try {
			Optional<Staff> staff = staffRepository.findById(staffId);
			
			if(staff.isPresent()) {
				
				Staff staffToBeUpdated = staff.get();
				staffToBeUpdated.setStaffName(staffName);
				staffToBeUpdated.setStaffEmail(staffEmail);
				staffToBeUpdated.setStaffDepartment(staffDepartment);
				staffToBeUpdated.setStaffDesignation(staffDesignation);
				staffToBeUpdated.setStaffMobileNo(staffMobileNo);
				staffToBeUpdated.setStaffGender(staffGender);
				
				Staff staffRef = staffRepository.save(staffToBeUpdated);
				
				return "dashboard.html";
			}else {
				return "redirect:listStaff";
			}
			
		} catch (Exception e) {
			return "redirect:listStaff";
		}
	} 
	
	@GetMapping("/deleteStaff/{id}")
	public String deleteStaff(@PathVariable("id") String staffId){
		try {
			System.out.println(staffId);
			staffRepository.deleteById(staffId);
			System.out.println("error");
			return "dashboard.html";
				
		} catch (Exception e) {
			System.out.println("exc");
			return "dashboard.html";
		}
	}
	
	@GetMapping("/clickAddStudent")
	public String clickAddStudent() {
		
		return "addStudent.html";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestParam String registrationNumber,@RequestParam String studentName,@RequestParam String studentEmail,@RequestParam String studentMobileNo,@RequestParam String studentDateOfBirth,@RequestParam String studentAdmiDate,@RequestParam String studentGender){
		try {
			
			Student studentRef = studentRepository.save(new Student(registrationNumber, studentName, studentEmail,
					studentMobileNo, studentDateOfBirth, studentAdmiDate, studentGender));
			return "redirect:listStudents";
		}catch (Exception e) {
			e.printStackTrace();
			return "redirect:listStudents";
		}
	}
	
	@GetMapping("/listStudents")
	public String listStudents(Model model){
		
		try {
			model.addAttribute("studentList", studentRepository.findAll());
			return "listStudents.html";
		}catch(Exception e) {
			return "dashboard.html";
		}
	}
	
	@GetMapping("/clickStudentUpdate/{id}")
	public String clickStudentUpdate(@PathVariable("id") String studentId) {
		
		return "updateStudent.html";
	}
	
	@GetMapping("/updateStudent/{id}")
	public String updateStudent(@PathVariable("id") String studentId, @RequestParam String registrationNumber,@RequestParam String studentName,@RequestParam String studentEmail,@RequestParam String studentMobileNo,@RequestParam String studentDateOfBirth,@RequestParam String studentAdmiDate,@RequestParam String studentGender ){
		try {
			Optional<Student> student = studentRepository.findById(studentId);
			
			if(student.isPresent()) {
				
				Student studentToBeUpdated = student.get();
				studentToBeUpdated.setStudentName(studentName);
				studentToBeUpdated.setStudentEmail(studentEmail);
				studentToBeUpdated.setStudentMobileNo(studentMobileNo);
				studentToBeUpdated.setStudentDateOfBirth(studentDateOfBirth);
				studentToBeUpdated.setStudentAdmiDate(studentAdmiDate);
				studentToBeUpdated.setStudentGender(studentGender);
				
				Student studentRef = studentRepository.save(studentToBeUpdated);
				
				return "dashboard.html";
			}else {
				return "redirect:listStudents";
			}
			
		} catch (Exception e) {
			return "redirect:listStudents";
		}
	} 
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable("id") String studentId){
		try {
			System.out.println(studentId);
			studentRepository.deleteById(studentId);
			System.out.println("error");
			return "dashboard.html";
				
		} catch (Exception e) {
			System.out.println("exc");
			return "dashboard.html";
		}
	}
	
	@GetMapping("/clickAddBatch")
	public String clickAddBatch() {
		
		return "addBatch.html";
	}
	
	@PostMapping("/addBatch")
	public String addBatch(@RequestParam String batchName,@RequestParam String batchYear,@RequestParam String feePerStudent,@RequestParam String numberOfStudents,@RequestParam String feeStatus,
			@RequestParam String staff){
		try {
			Batch batchRef = batchRepository.save(new Batch(batchName, batchYear, feePerStudent, numberOfStudents, feeStatus,
					staff));
			return "redirect:listBatches";
		}catch (Exception e) {
			return "redirect:listBatches";
		}
	}
	
	@GetMapping("/listBatches")
	public String listBatches(Model model){
		
		try {
			
			model.addAttribute("batchList", batchRepository.findAll());
	        return "listBatches.html";
		}catch(Exception e) {
			return "dashboard.html";
		}
	}
	
	@GetMapping("/clickBatchUpdate")
	public String clickBatchUpdate() {
		
		return "updateBatch.html";
	}
	
	@GetMapping("/deleteBatch/{id}")
	public String deleteBatch(@PathVariable("id") String batchId){
		try {
			System.out.println(batchId);
			batchRepository.deleteById(batchId);
			System.out.println("error");
			return "dashboard.html";
				
		} catch (Exception e) {
			System.out.println("exc");
			return "dashboard.html";
		}
	}
	
}