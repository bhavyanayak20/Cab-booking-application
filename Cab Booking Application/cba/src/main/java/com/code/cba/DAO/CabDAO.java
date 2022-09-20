package com.code.cba.DAO;

import java.util.List;

import com.code.cba.entity.Cab;
import com.code.cba.entity.Driver;

public interface CabDAO {
	public int viewCab(int CabId) ;

	public int insertCab(Cab Cab) ;

	public int updateCab(Cab Cab)  ;

	public int deleteCab(int CabId)  ;
	
	public List<Cab> viewCab() ;

	public int deleteCab(Cab CabId);
	public Cab getById(int id);

}

