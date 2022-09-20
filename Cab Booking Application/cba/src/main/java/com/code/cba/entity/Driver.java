package com.code.cba.entity;
import java.io.Serializable;

import javassist.bytecode.ByteArray;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.sql.Blob;

@Entity
@Table(name="Driver")
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="driverid")
	 int driverid;
	
	
	@Column(name="drivername")
	@NotEmpty(message="required")
	 String drivername;
	
	
	@Column(name="drivermobile")
	@NotEmpty(message="required")
	 String drivermobile;
	
	
	@Column(name="driverlicense")
	@NotEmpty(message="required")
	 String driverlicense;
	
	

	public Driver() {
		
	}

	public Driver(int id, String name, String mobile, String license) {
		super();
		this.driverid = id;
		this.drivername = name;
		this.drivermobile = mobile;
		this.driverlicense = license;
	}

	

	

	public int getDriverid() {
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public String getDrivermobile() {
		return drivermobile;
	}

	public void setDrivermobile(String drivermobile) {
		this.drivermobile = drivermobile;
	}

	public String getDriverlicense() {
		return driverlicense;
	}

	public void setDriverlicense(String driverlicense) {
		this.driverlicense = driverlicense;
	}



	
	
}
