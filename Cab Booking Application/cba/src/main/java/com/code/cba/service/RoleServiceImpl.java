package com.code.cba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.code.cba.DAO.RoleDAO;
import com.code.cba.entity.Role;
//Add transaction and Service
@Service
@Transactional //will create the bean for the session.beginTranction ----- session.commit
public class RoleServiceImpl implements RoleService {
	//Inject CategoryDAO
	@Autowired
	RoleDAO roledao;
	@Override
	public int add(Role role) {
		
		return roledao.add(role);
	}

	@Override
	public int update(Role role) {
		// TODO Auto-generated method stub
	return roledao.update(role);
	}

	@Override
	public int delete(Role role) {
		// TODO Auto-generated method stub
	return roledao.delete(role);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return roledao.delete(id);
	}

	@Override
	public List<Role> getAll() {
		// TODO Auto-generated method stub
		return roledao.getAll();
	}

	@Override
	public Role getById(int id) {
		// TODO Auto-generated method stub
	return roledao.getById(id);
	}

	@Override
	public List<Role> searchRole(String role) {
		// TODO Auto-generated method stub
		return roledao.searchRole(role);
	}

	

}
