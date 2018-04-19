/**
 * 
 */
package com.practice.ems.resources;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shiny
 *
 */
public class Employee {
	
	public List<com.practice.ems.entity.Employee> employees = new ArrayList<com.practice.ems.entity.Employee>();

	/**
	 * @return the employees
	 */
	public List<com.practice.ems.entity.Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<com.practice.ems.entity.Employee> employees) {
		this.employees = employees;
	}
	
	
	

}
