package com.code.cba.service;
import java.util.List;

import com.code.cba.entity.Cab;
import com.code.cba.entity.Driver;
import com.code.cba.entity.booking;
public interface bookingservice {

	public int viewbooking(int bookingId) ;

	public int insertbooking(booking booking) ;

	public int updatebooking(booking booking)  ;

	//public int deleteDriver(int driverId)  ;
	
	public List<booking> viewbooking() ;
	public int deletebooking(int bookingId)  ;
	public int deletebooking(booking booking);
	public booking getById(int id);

}
