package com.code.cba.DAO;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.code.cba.entity.Cab;
import com.code.cba.entity.Driver;
import com.code.cba.entity.booking;
@Repository
public class bookingDAOImpl implements bookingDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public int viewbooking(int bookingId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertbooking(booking booking) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(booking);
		return booking.getBookingId();
	}

	@Override
	public int updatebooking(booking booking) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(booking);
		//close the session
		//session.close();
        return  booking.getBookingId();
	}

	@Override
	public int deletebooking(int bookingId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		booking booking1=session.get(booking.class, bookingId);
	if(booking1==null)
	{
		return -1;//no record found; 
	}
	//if found then delete the record
	session.delete(booking1);
	//close the session
	//session.close();
		return 1;//record is updated successfully	
	}
	

	@Override
	public List<booking> viewbooking() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		//createCriteria the object provided by the  HiberNate
			//we pass the class and we get the list of the object
			//select * from student
	     List<booking> bookings=currentSession.createCriteria(booking.class).list();
	    return bookings;
		
	}

	@Override
	public int deletebooking(booking booking) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		//search the driver eixts the id exists or not
		booking booking1=session.get(booking.class, booking.getBookingId());
	//check the  is null or null if null means no record
	if(booking1==null)
	{
		return -1;//no record found; 
	}
	//if found then delete the record
	session.delete(booking1);
	//close the session
	//session.close();
		return 1;//record is updated successfully
	
	}
	
	@Override
	public booking getById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		//search the student eixts the id exists or not
		booking booking=session.get(booking.class, id);
		return booking;
	}

}
