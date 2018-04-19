/**
 * 
 */
package com.practice.ems.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ems.entity.Employee;
import com.practice.ems.exceptions.EmployeeException;
import com.practice.ems.repository.IEmployeeRepository;
import com.practice.ems.resources.Message;

/**
 * @author shiny
 *
 */

@RestController
@RequestMapping(value = "/employee", consumes= "application/json", produces="application/json")
public class EmployeeController {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	IEmployeeRepository employeeRespository; 
	
	@RequestMapping(value = "/new", method=RequestMethod.POST)
	public Message createEmployee(@RequestBody Employee employee) throws EmployeeException {
		
		String message;
		try
		{
		employeeRespository.save(employee);
		message = "New employee created.";
		}
		catch(Exception e)
		{
			message = "Unable to create new Employee: " + employee.toString();
			throw new EmployeeException(message);
		}
		
		return new Message(message);
	}
}
