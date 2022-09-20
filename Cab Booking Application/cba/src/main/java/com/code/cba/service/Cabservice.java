package com.code.cba.service;

import java.util.List;

import com.code.cba.entity.Cab;
import com.code.cba.entity.Driver;

public interface Cabservice {

	public int viewCab(int CabId) ;

	public int insertCab(Cab Cab) ;

	public int updateCab(Cab Cab)  ;

	//public int deleteDriver(int driverId)  ;
	
	public List<Cab> viewCab() ;
	public int deleteCab(int CabId)  ;
	public int deleteCab(Cab Cab);
	public Cab getById(int id);

}
