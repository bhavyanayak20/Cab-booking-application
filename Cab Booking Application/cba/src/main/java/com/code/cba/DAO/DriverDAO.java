package com.code.cba.DAO;

import java.util.List;

import com.code.cba.entity.Driver;


public interface DriverDAO {

	public int viewDriver(int driverId) ;

	public int insertDriver(Driver driver) ;

	public int updateDriver(Driver driver)  ;

	public int deleteDriver(int driverId)  ;
	
	public List<Driver> viewDrivers() ;

	public int deleteDriver(Driver driver);
	public Driver getById(int id);

}
