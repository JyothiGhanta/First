package org.cap.model;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class Employee {
	private int empId;
	
	@NotEmpty(message="* Please enter FirstName")
	private String firstName;
	private String lastName;
	
	@Range(min=2000,max=50000,message="*Please enter salary between 2000 to 50000.")
	private double salary;
	
	@Past(message="* Date of birth must be past date.")
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date emoDob;
	
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private Date emoDoj;
	
	@Email(message="* Please enter valid EmailID")
	@NotEmpty(message="* Please enter Email Id")
	private String email;
	
	
	public Employee(){}
	
	
	public Employee(int empId, String firstName, String lastName, double salary, Date emoDob, Date emoDoj) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.emoDob = emoDob;
		this.emoDoj = emoDoj;
	}
	
	
	
	public Employee(int empId, String firstName, String lastName, double salary, Date emoDob, Date emoDoj,
			String email) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.emoDob = emoDob;
		this.emoDoj = emoDoj;
		this.email = email;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getEmoDob() {
		return emoDob;
	}
	public void setEmoDob(Date emoDob) {
		this.emoDob = emoDob;
	}
	public Date getEmoDoj() {
		return emoDoj;
	}
	public void setEmoDoj(Date emoDoj) {
		this.emoDoj = emoDoj;
	}
	
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", emoDob=" + emoDob + ", emoDoj=" + emoDoj + ", email=" + email + "]";
	}


}
