package com.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value = "/hello")
	public ModelAndView helloWorld(HttpServletRequest req, HttpServletResponse res) {
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		if (password.equals("admin")) {
			String msg = "Hello " + name;
			return new ModelAndView("hellopage", "message", msg);
		} else {
			String msg = "Error : UnAuthorised Access!!";
			return new ModelAndView("errorpage", "message", msg);
		}
	}
}
