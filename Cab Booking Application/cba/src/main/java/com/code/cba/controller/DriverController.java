package com.code.cba.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.code.cba.entity.Driver;
import com.code.cba.service.Driverservice;



@Controller
@RequestMapping("/driver")
public class DriverController {
	
	@Autowired
	Driverservice driverservice;
	
	@RequestMapping("showform")
	public String showForm(Model model)
	{
		//create the object of the student class
		Driver driver=new Driver();
		//create add the student to the model 
		model.addAttribute("driver",driver);
		return "driver-form";
	}
	
	

@RequestMapping(value="driverform",method=RequestMethod.POST)
public String driverForm(@ModelAttribute("driver") Driver thedriver)
{
	//we check the value of the driver id
	//if it is null or 0 we will add the record else
	//update the record
	//call the service method to add the driver and pass the driver object
	//print the value of the id
	System.out.println("Id"+thedriver.getDriverid());
	if(thedriver.getDriverid()>0)
	{
		driverservice.updateDriver(thedriver);
	}
	else
	{
		driverservice.insertDriver(thedriver);
	}

	
	return "redirect://driver/driverlist";
}
@RequestMapping("list")
public String list(Model model)
{
	//get the list of the students from the service
	List<Driver> drivers=	driverservice.viewDrivers();
	//we add the studentlist to the model
	model.addAttribute("drivers",drivers);
	//retunr the view
	return "driverlist";
}

//requestmapping for edit
@RequestMapping("editdriver/{id}")
//{id} we can get this by using @pathvariable to get the value from the url
public ModelAndView editdriver(@PathVariable("id") int driverid)
{
	//we get the driver information from the service for the id
	Driver driver=driverservice.getById(driverid);
	Map<String, Object> model = new HashMap<String, Object>();
	//add the driver object to the model
	model.put("driver", driver);
	//retunr the view
	return new ModelAndView("driver-form",model);
	
}

@RequestMapping("deletedriver/{id}")
//{id} we can get this by using @pathvariable to get the value from the url
public String deletedriver(@PathVariable int id,Model model)
{
	System.out.println(id);
	driverservice.deleteDriver(id);
	
	return "redirect://driver/list";
}


@RequestMapping(value="save",method=RequestMethod.POST)
public String SaveDriver(HttpServletRequest request, @ModelAttribute("driver") Driver driver  ,Model model)
{
	
	
		 
                if(driver.getDriverid()>0)
                driverservice.updateDriver(driver);
                else
                	 driverservice.insertDriver(driver);
    			
    			//request.getSession().setAttribute("category", category);
	
    			
    			return "redirect://driver/list";
                 
             

        
        
}
}