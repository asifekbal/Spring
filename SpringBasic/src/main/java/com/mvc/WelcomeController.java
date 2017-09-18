package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome")
	public ModelAndView welcome() {
		String msg = "Welcome Spring MVC !!!";
		return new ModelAndView("welcome", "message", msg);
	}
}
