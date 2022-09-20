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
@Table(name="booking")
public class booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bookingId")
	 int bookingId;

	@Column(name="startLocation")
	 String startLocation;
	
	@Column(name="endLocation")
	 String endLocation;
	
	@Column(name="bookingFare")
	 float bookingFare;
	
	@Column(name="startTime")
	 float startTime;
	
	@Column(name="endTime")
	float endTime;
	
	@Column(name="CabId")
	int CabId;
	
	@Column(name="driverid")
	int driverid;
	

	public booking() {
		
	}

	public booking(int bookingId, String startLocation, String endLocation, float startTime, float endTime, int CabId, int driverid) {
		super();
		this.bookingId = bookingId;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.startTime = startTime;
		this.endTime=endTime;
		this.CabId=CabId;
		this.driverid=driverid;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public float getBookingFare() {
		return bookingFare;
	}

	public void setBookingFare(float bookingFare) {
		this.bookingFare = bookingFare;
	}

	public float getStartTime() {
		return startTime;
	}

	public void setStartTime(float startTime) {
		this.startTime = startTime;
	}

	public float getEndTime() {
		return endTime;
	}

	public void setEndTime(float endTime) {
		this.endTime = endTime;
	}

	public int getCabId() {
		return CabId;
	}

	public void setCabId(int cabId) {
		CabId = cabId;
	}

	public int getDriverid() {
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	
	


}
