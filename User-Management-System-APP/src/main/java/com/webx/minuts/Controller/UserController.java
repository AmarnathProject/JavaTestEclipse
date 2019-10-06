package com.webx.minuts.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webx.minuts.Service.UserService;

@Controller
public class UserController {

	@Autowired
    private UserService userService;	
	
	//Get list of User API
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public ModelAndView listOfUser() {
		
		
		return null;

	}
}
