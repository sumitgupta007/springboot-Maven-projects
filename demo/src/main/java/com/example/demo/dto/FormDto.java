package com.example.demo.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.example.demo.dto.validator.Age;



public class FormDto {
//	@NotEmpty(message="* name can not be empty")
	@NotBlank(message="* name can not be blank")
	private String name;
	@NotEmpty(message = "cannot be empty")
	private String username;
//	@Size(min = 18,max = 80,message = "greater than 18-80")
//	@Max(value = 70,message = "b/w than 18-80")
//	@Min(value = 18,message = "b/w than 18-80")
	@Age
	private Integer age;
	private Long contact;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public String setUsername(String username) {
		return this.username = username;
	}
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "FormDto [name=" + name + ", username=" + username + ", age=" + age + ", contact=" + contact + ", email="
				+ email + "]";
	}
	
	
}
