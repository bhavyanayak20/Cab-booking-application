package com.code.cba.DAO;
import java.util.List;

import com.code.cba.entity.Cab;
import com.code.cba.entity.Driver;
import com.code.cba.entity.booking;
public interface bookingDAO {
	public int viewbooking(int bookingId) ;

	public int insertbooking(booking booking) ;

	public int updatebooking(booking booking)  ;

	public int deletebooking(int bookingId)  ;
	
	public List<booking> viewbooking() ;

	public int deletebooking(booking bookingId);
	public booking getById(int id);
}
