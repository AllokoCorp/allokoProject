package com.project.Alloco.shared.model;

import java.io.Serializable;

public class user_info implements Serializable{
	
	private String  name;
	private String  sex;
	private String  birth;
	private String  email;
	private String  password;
	
	public user_info(){
		
	}
	

	public user_info(String name, String sex, String birth, String email,
			String password) {
		super();
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.email = email;
		this.password = password;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}

