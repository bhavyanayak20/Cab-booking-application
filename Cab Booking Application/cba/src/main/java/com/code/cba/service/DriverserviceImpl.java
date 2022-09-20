package com.code.cba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.cba.DAO.DriverDAO;
import com.code.cba.entity.Driver;
@Service
@Transactional //will create the bean for the session.beginTranction ----- session.commit
public class DriverserviceImpl implements Driverservice {
	
	@Autowired
	DriverDAO driverdao;

	@Override
	public int viewDriver(int driverId) {
		// TODO Auto-generated method stub
		return driverdao.viewDriver(driverId);
	}

	@Override
	public int insertDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverdao.insertDriver(driver);
	}

	@Override
	public int updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverdao.updateDriver(driver);
	}

	@Override
	public List<Driver> viewDrivers() {
		// TODO Auto-generated method stub
		return driverdao.viewDrivers();
	}

	@Override
	public int deleteDriver(Driver driver) {
		// TODO Auto-generated method stub
		return driverdao.deleteDriver(driver);
	}

	@Override
	public Driver getById(int id) {
		// TODO Auto-generated method stub
		return driverdao.getById(id);
	}

	@Override
	public int deleteDriver(int driverId) {
		// TODO Auto-generated method stub
		return driverdao.deleteDriver(driverId);
	}

}
