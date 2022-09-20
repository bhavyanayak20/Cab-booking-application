package com.code.cba.service;

import java.util.List;

import com.code.cba.entity.Driver;


public interface Driverservice {
	
	public int viewDriver(int driverId) ;

	public int insertDriver(Driver driver) ;

	public int updateDriver(Driver driver)  ;

	//public int deleteDriver(int driverId)  ;
	
	public List<Driver> viewDrivers() ;
	public int deleteDriver(int driverId)  ;
	public int deleteDriver(Driver driver);
	public Driver getById(int id);

}
