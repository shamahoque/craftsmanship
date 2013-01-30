package com.shoque.notentask.model;

import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	private String email;
	private String Password;
	private String name;

	private Date birthDate;

	private String gender;

	private String country;

	private String registrationType;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		
		
		return " Name : " + name + "\n" + " email: " + email + " \n Gender :  "
				+ gender + "\n Country : " + country +  "\n Birth Date : " +df.format(birthDate)+ "\n Registration Type " + registrationType;
	}

}
