package com.bank.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bank.pojo.Customer;

@Repository
public class CustomerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void saveCustomer(Customer c) {
		hibernateTemplate.save(c);
	}

	public void updateCustomer(Customer c) {
		hibernateTemplate.update(c);
	}

	public void deleteCustomer(Customer c) {
		hibernateTemplate.delete(c);
	}

	public Customer getById(int id) {
		Customer c = (Customer) hibernateTemplate.get(Customer.class, id);
		return c;
	}

//	public Customer getByEmail(String email) {
//		Customer c = (Customer) hibernateTemplate.fi
//		return c;
//	}

	public List<Customer> getCustomers() {
		List<Customer> list = new ArrayList<Customer>();
		list = hibernateTemplate.loadAll(Customer.class);
		return list;
	}
}
