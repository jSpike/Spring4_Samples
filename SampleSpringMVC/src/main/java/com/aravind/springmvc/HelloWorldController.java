package com.aravind.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Simple SpringMVC 4 application controller for hello world program
 * 
 * @author aravind
 *
 */
@Controller
public class HelloWorldController {

	/**
	 * default constructor
	 */
	public HelloWorldController() {
	
	}
	
	/**
	 * hello world controller
	 * @param name
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(
			@RequestParam(required = true, value = "name") String name,
			Model model) {
		model.addAttribute("name", name);
		System.out.println("in controller::" + name);
		return "helloworld";
	}

}
