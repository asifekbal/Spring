package com.orm;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class EmployeeDao {
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void saveEmployee(Employee s) {
		hibernateTemplate.save(s);
	}

	public void updateEmployee(Employee s) {
		hibernateTemplate.update(s);
	}

	public void deleteEmployee(Employee s) {
		hibernateTemplate.delete(s);
	}

}
