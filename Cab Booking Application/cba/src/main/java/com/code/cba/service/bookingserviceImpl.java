package com.code.cba.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.code.cba.DAO.CabDAO;
import com.code.cba.DAO.DriverDAO;
import com.code.cba.DAO.bookingDAO;
import com.code.cba.entity.Cab;
import com.code.cba.entity.booking;
@Service
@Transactional
public class bookingserviceImpl implements bookingservice {
	@Autowired
	bookingDAO bookingdao;
	@Override
	public int viewbooking(int bookingId) {
		// TODO Auto-generated method stub
		return bookingdao.viewbooking(bookingId);
	}

	@Override
	public int insertbooking(booking booking) {
		// TODO Auto-generated method stub
		return bookingdao.insertbooking(booking);
	}

	@Override
	public int updatebooking(booking booking) {
		// TODO Auto-generated method stub
		return bookingdao.updatebooking(booking);
	}

	@Override
	public List<booking> viewbooking() {
		// TODO Auto-generated method stub
		return bookingdao.viewbooking();
	}

	@Override
	public int deletebooking(int bookingId) {
		// TODO Auto-generated method stub
		return bookingdao.deletebooking(bookingId);
	}

	@Override
	public int deletebooking(booking booking) {
		// TODO Auto-generated method stub
		return bookingdao.deletebooking(booking);
	}

	@Override
	public booking getById(int id) {
		// TODO Auto-generated method stub
		return bookingdao.getById(id);
	}

}
