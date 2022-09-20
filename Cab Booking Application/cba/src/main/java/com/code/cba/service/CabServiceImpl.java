package com.code.cba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.cba.DAO.CabDAO;
import com.code.cba.DAO.DriverDAO;
import com.code.cba.entity.Cab;
@Service
@Transactional
public class CabServiceImpl implements Cabservice {

	@Autowired
	CabDAO Cabdao;
	
	@Override
	public int viewCab(int CabId) {
		// TODO Auto-generated method stub
		return Cabdao.viewCab(CabId);

	}

	@Override
	public int insertCab(Cab Cab) {
		// TODO Auto-generated method stub
		return Cabdao.insertCab(Cab);

	}

	@Override
	public int updateCab(Cab Cab) {
		// TODO Auto-generated method stub
		return Cabdao.updateCab(Cab);
	}

	@Override
	public List<Cab> viewCab() {
		// TODO Auto-generated method stub
		
		return Cabdao.viewCab();
	}

	@Override
	public int deleteCab(int CabId) {
		// TODO Auto-generated method stub
		return Cabdao.deleteCab(CabId);

	}


	@Override
	public Cab getById(int id) {
		// TODO Auto-generated method stub
		return Cabdao.getById(id);
	}

	@Override
	public int deleteCab(Cab Cab) {
		// TODO Auto-generated method stub
		return Cabdao.deleteCab(Cab);

	}
	
}
