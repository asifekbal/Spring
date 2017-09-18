package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bank.pojo.Customer;
import com.bank.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/custform")
	public ModelAndView addEmployee() {
		return new ModelAndView("custform");
	}

	@RequestMapping(value = "/savecust", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute("cust") Customer cust) {
		customerService.saveCustomer(cust);
		return new ModelAndView("token");
	}
}
