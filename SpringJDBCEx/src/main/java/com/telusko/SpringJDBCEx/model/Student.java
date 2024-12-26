package com.telusko.SpringJDBCEx.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

//	private int rollNo;
//	private String name;
//	private int marks;
//
//	public int getRollNo() {
//		return rollNo;
//	}
//
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getMarks() {
//		return marks;
//	}
//
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
//
//	@Override
//	public String toString() {
//		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
//	}
	
	private String firstName;
	private String lastName;
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}	
	
}
