package com.code.cba.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.code.cba.entity.Cab;
import com.code.cba.entity.Driver;
@Repository
public class CabDAOImpl implements CabDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public int viewCab(int CabId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertCab(Cab Cab) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(Cab);
		return Cab.getCabId();

	}

	@Override
	public int updateCab(Cab Cab) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(Cab);
		//close the session
		//session.close();
        return  Cab.getCabId();
	}

	@Override
	public int deleteCab(int CabId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Cab Cab1=session.get(Cab.class, CabId);
	if(Cab1==null)
	{
		return -1;//no record found; 
	}
	//if found then delete the record
	session.delete(Cab1);
	//close the session
	//session.close();
		return 1;//record is updated successfully	
	}

	@Override
	public List<Cab> viewCab() {
		// TODO Auto-generated method stub
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
	//createCriteria the object provided by the  HiberNate
		//we pass the class and we get the list of the object
		//select * from student
     List<Cab> Cabs=currentSession.createCriteria(Cab.class).list();
    return Cabs;
	}

	@Override
	public int deleteCab(Cab Cab) {
		// TODO Auto-generated method stub
	
		Session session=sessionFactory.getCurrentSession();
		//search the driver eixts the id exists or not
		Cab cab1=session.get(Cab.class, Cab.getCabId());
	//check the  is null or null if null means no record
	if(cab1==null)
	{
		return -1;//no record found; 
	}
	//if found then delete the record
	session.delete(cab1);
	//close the session
	//session.close();
		return 1;//record is updated successfully
	
	}
	@Override
	public Cab getById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		//search the student eixts the id exists or not
		Cab cab=session.get(Cab.class, id);
		return cab;
	}


	}



