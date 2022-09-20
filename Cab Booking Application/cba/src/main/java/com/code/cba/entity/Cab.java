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

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.sql.Blob;

@Entity
@Table(name="Cab")
public class Cab {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CabId")
	 int CabId;

	@Column(name="CabModelName")
	 String CabModelName;
	
	@Column(name="CabNumber")
	 int CabNumber;
	
	@Column(name="CabType")
	 String CabType;
	
	@Column(name="Seats")
	 int Seats;

	public Cab() {
		
	}

	public Cab(int CabId, String CabModelName, int CabNumber, String CabType, int Seats) {
		super();
		this.CabId = CabId;
		this.CabModelName = CabModelName;
		this.CabNumber = CabNumber;
		this.CabType = CabType;
		this.Seats=Seats;
	}
	
	
	

	public int getCabId() {
		return CabId;
	}

	public void setCabId(int cabId) {
		CabId = cabId;
	}

	public String getCabModelName() {
		return CabModelName;
	}

	public void setCabModelName(String cabModelName) {
		CabModelName = cabModelName;
	}

	public int getCabNumber() {
		return CabNumber;
	}

	public void setCabNumber(int cabNumber) {
		CabNumber = cabNumber;
	}

	public String getCabType() {
		return CabType;
	}

	public void setCabType(String cabType) {
		CabType = cabType;
	}

	public int getSeats() {
		return Seats;
	}

	public void setSeats(int seats) {
		Seats = seats;
	}

}