package com.code.cba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.*;
@Entity
@Table(name="userinfo")
public class User {

	@Id
	@Column(name="Email")
	@NotEmpty(message="required")
	
	@Email
	@NotEmpty(message="required")
	private String Email;
	
	@Column(name="password")
	@NotNull(message = "reuiqred")
	@Pattern(regexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$",message="Password should contains number uppercase and special chracater min 8 max 20") 
	private String pwd;
	
	@Column(name="name")
	@NotEmpty(message="required")
	private String name;
	
	@Column(name="gender")
	private String gender;
	
	//relationship will be with Role
	@OneToOne
	@JoinColumn(name="roleId")
	Role role;
	public User()
	{
		
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
