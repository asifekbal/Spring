package com.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpController {
	@RequestMapping(value = "/empform")
	public ModelAndView addEmployee() {
		return new ModelAndView("empform", "command", new Emp());
	}

	@RequestMapping(value = "/saveemp", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("emp") Emp emp) {
		System.out.println(emp.getName() + " " + emp.getSalary() + " " + emp.getDesignation());
		return new ModelAndView("redirect:/viewemp");
	}

	@RequestMapping(value = "/viewemp")
	public ModelAndView viewEmployee() {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(1, "Asif", 43000f, "Hybris Developer"));
		list.add(new Emp(2, "Rohit", 34000f, "Amdocs Developer"));
		list.add(new Emp(3, "Kush", 38000f, "SAP Developer"));
		return new ModelAndView("viewemp", "list", list);
	}
}
