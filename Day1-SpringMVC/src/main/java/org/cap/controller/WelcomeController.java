package org.cap.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController {
	@RequestMapping(value = "/welcome", method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE)
	public  ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from java world **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
		
//		return "welcome";
	}
}
