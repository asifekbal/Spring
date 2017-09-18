package com.bank.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.CustomerDao;
import com.bank.pojo.Customer;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerDao customerDao;

	public void saveCustomer(final Customer cust) {
		customerDao.saveCustomer(cust);
	}
}
