/**
 * 
 */
package com.practice.ems.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.practice.ems.entity.Employee;

/**
 * @author shiny
 *
 */
public interface IEmployeeRepository extends CrudRepository<Employee, BigInteger> {
	
	List<Employee> findByEmpid(BigInteger empid);
	List<Employee> findByEmplastname(String empLastName);
	List<Employee> findByEmpdeptid(int empDeptId);
	List<Employee> findByEmpmanagerid(int empManagerId);
	List<Employee> findByEmphrpartnerid(int empHrPartnerId);

}
