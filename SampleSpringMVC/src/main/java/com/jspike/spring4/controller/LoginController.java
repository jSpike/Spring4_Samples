/**
 * 
 */
package com.jspike.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jspike.spring4.dataobject.Login;

/**
 * Controller that helps to fetch login details from jsp page
 * 
 * @author aravind
 *
 */
@Controller
public class LoginController {

	/**
	 * default constructor
	 */
	public LoginController() {
		
	}
	
	/**
	 * Post request for login details
	 * @param login
	 * @param model
	 * @return string
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postProcess(@ModelAttribute("SpringWeb") Login login,
			ModelMap model) {
		model.addAttribute("loginName", login.getLoginName());
		model.addAttribute("password", login.getPassword());
		System.out.println("Login controller::" + login.getLoginName()
				+ "\npassword::" + login.getPassword());
		return "home";
	}

}
