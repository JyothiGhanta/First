package org.cap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView sayHello(){
		String msg="Hello! Welcome To Spring3 MVC!";
		
		return new ModelAndView("helloPage", "message", msg);
	}
	
}
