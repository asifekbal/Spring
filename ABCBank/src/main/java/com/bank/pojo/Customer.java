package com.bank.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.bank.enumeration.ServiceType;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	private String email;
	private String name;
	private String phone;
	//@OneToOne
	private String address;
	private Enum<ServiceType> servicetype;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Enum<ServiceType> getServicetype() {
		return servicetype;
	}

	public void setServicetype(Enum<ServiceType> servicetype) {
		this.servicetype = servicetype;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", email=" + email + ", name=" + name + ", phone=" + phone
				+ ", address=" + address + ", servicetype=" + servicetype + "]";
	}
	
}
