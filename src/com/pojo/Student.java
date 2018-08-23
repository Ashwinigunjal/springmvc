package com.pojo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	@NotNull
	@Size(min=1 ,message ="is Required")
	private String name;
	
	
	private String password;

	private String country;
	private String favlang;
	private String[] os;
	
	
	private String email;
	private int age;
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String[] getOs() {
		return os;
	}
	public void setOs(String[] os) {
		this.os = os;
	}
	public String getFavlang() {
		return favlang;
	}
	public void setFavlang(String favlang) {
		this.favlang = favlang;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
