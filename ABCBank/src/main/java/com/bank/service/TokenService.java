package com.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.CustomerDao;
import com.bank.dao.TokenDao;
import com.bank.enumeration.ServiceType;
import com.bank.pojo.Customer;

@Service
public class TokenService {

	@Autowired
	private TokenDao tokenDao;

	@Autowired
	private CustomerDao customerDao;

	public String assignToken(String email) {
		
//		if (null != email) {
//			Customer cust =customerDao.getByEmail(email);
//			System.out.println(Customer.class.toString());
//		}
//			if (cust.getServicetype().equals(ServiceType.REGULAR)) {
//				//return generateRegularToken();
//			} else {
//				//return generatePremiumToken();
//			}
		return "token";
	}
}