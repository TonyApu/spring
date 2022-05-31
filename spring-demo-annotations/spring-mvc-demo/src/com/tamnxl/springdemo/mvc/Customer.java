package com.tamnxl.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.tamnxl.springdemo.mvc.validation.CourseCode;

public class Customer {
	
	private String firstName;
	
	@NotNull(message ="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message ="is required")
	@Min(value = 0, message="must be greater than or equal to zero")
	@Max(value = 10, message="must be less than or equal to ten")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message ="only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value = "AR", message = "Must start with AR	")
	private String codeCourse;
	
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

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCodeCourse() {
		return codeCourse;
	}

	public void setCodeCourse(String codeCourse) {
		this.codeCourse = codeCourse;
	}
	
}
