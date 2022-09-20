package com.code.cba.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.code.cba.entity.Cab;
import com.code.cba.entity.Driver;
import com.code.cba.entity.booking;
import com.code.cba.service.*;



@Controller
@RequestMapping("/booking")
public class bookingController {

	@Autowired
	bookingservice bookingservice;
	
	@RequestMapping("showform")
	public String showForm(Model model)
	{
		//create the object of the student class
		booking booking=new booking();
		//create add the student to the model 
		model.addAttribute("booking",booking);
		return "booking-form";
	}
	
	

@RequestMapping(value="bookingform",method=RequestMethod.POST)
public String driverForm(@ModelAttribute("booking") booking thebooking)
{
	//we check the value of the driver id
	//if it is null or 0 we will add the record else
	//update the record
	//call the service method to add the driver and pass the driver object
	//print the value of the id
	System.out.println("Id"+thebooking.getBookingId());
	if(thebooking.getBookingId()>0)
	{
		bookingservice.updatebooking(thebooking);
	}
	else
	{
		bookingservice.insertbooking(thebooking);
	}

	
	return "redirect://booking/bookinglist";
}
@RequestMapping("list")
public String list(Model model)
{
	//get the list of the students from the service
	List<booking> bookings=	bookingservice.viewbooking();
	//we add the studentlist to the model
	model.addAttribute("bookings",bookings);
	//retunr the view
	return "bookinglist";
}

//requestmapping for edit
@RequestMapping("editbooking/{id}")
//{id} we can get this by using @pathvariable to get the value from the url
public ModelAndView editbooking(@PathVariable ("id") int bookingId)
{
	//we get the driver information from the service for the id
	booking booking=bookingservice.getById(bookingId);
	//add the driver object to the model
	Map<String, Object> model = new HashMap<String, Object>();
	model.put("booking", booking);
	//retunr the view
	return new ModelAndView("booking-form",model);
}



@RequestMapping("deletebooking/{id}")
//{id} we can get this by using @pathvariable to get the value from the url
public String deletebooking(@PathVariable int id,Model model)
{
	System.out.println(id);
	bookingservice.deletebooking(id);
	
	return "redirect://item/list";
}


@RequestMapping(value="save",method=RequestMethod.POST)
public String SaveDriver(HttpServletRequest request, @ModelAttribute("booking") booking booking  ,Model model)
{
	
		 
                if(booking.getBookingId()>0)
                	bookingservice.updatebooking(booking);
                else
                	bookingservice.insertbooking(booking);
    			
    			//request.getSession().setAttribute("category", category);
    			
    			return "redirect://booking/list";
       
}
}
