package com.adiaz.beans;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Information about the system user.")
public class User {

	private Integer id;
	@ApiModelProperty(notes="First name of user (at least 2 characters).", 
			example="Antoine")
	private String name;
	@ApiModelProperty(notes="Must be in the past.", 
			example="1977-02-12")
	private Date birthDate;
	
	public User() { }
	
	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
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
}
