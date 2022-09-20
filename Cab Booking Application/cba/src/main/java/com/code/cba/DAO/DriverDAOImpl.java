package com.code.cba.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.code.cba.entity.Driver;




@Repository
public class DriverDAOImpl implements DriverDAO{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public int insertDriver(Driver driver) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(driver);
		return driver.getDriverid();
	}
	
	
	@Override
	public int viewDriver(int driverId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(driver);
		//close the session
		//session.close();
			return  driver.getDriverid();
	}

	
	@Override
	public int deleteDriver(Driver driver) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		//search the student eixts the id exists or not
		Driver driver1=	session.get(Driver.class, driver.getDriverid());
	//check if it is null or null if null means no record
	if(driver==null)
	{
		return -1;//no record found; 
	}
	//if found then delete the record
	session.delete(driver);
	//close the session
	//session.close();
		return 1;//record is updated successfully	
		
	}

	@Override
	public List<Driver> viewDrivers() {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
			//createCriteria the object provided by the  HiberNate
				//we pass the class and we get the list of the object
				//select * from student
		List<Driver> drivers=currentSession.createCriteria(Driver.class).list();
		return drivers;
	}


	@Override
	public Driver getById(int id) {
		Session session=sessionFactory.getCurrentSession();
		//search the student eixts the id exists or not
		Driver driver=	session.get(Driver.class, id);
		return driver;
	}


	@Override
	public int deleteDriver(int driverId) {
		// TODO Auto-generated method stub
			//create the object of the Session using the SessionFactory
			Session session=sessionFactory.getCurrentSession();
			//search the driver eixts the id exists or not
			Driver driver1=	session.get(Driver.class, driverId);
		//check the  is null or null if null means no record
		if(driver1==null)
		{
			return -1;//no record found; 
		}
		//if found then delete the record
		session.delete(driver1);
		//close the session
		//session.close();
			return 1;//record is updated successfully
		
	}

}
