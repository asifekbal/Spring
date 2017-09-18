package com.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao) context.getBean("edao");
		int status = employeeDao.saveEmployeeNamedParameter(new Employee(120,"Hannah",1120));
		System.out.println(status);
		Employee e = new Employee(103,"Taslim",2008);
		status = employeeDao.updateEmployeeVarArgs(e);
		System.out.println(status);
		
		List<Employee> list = employeeDao.getAllEmployeesRowMapper();
		for(Employee em : list) {
			System.out.println(em);
		}
	}

}
