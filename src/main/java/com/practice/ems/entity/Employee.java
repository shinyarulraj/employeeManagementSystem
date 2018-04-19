/**
 * 
 */
package com.practice.ems.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author shiny
 *
 */

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger empid;
	private String empfirstname;
	private String emplastname;
	private String empmiddlename;
	private Date empdoj;
	private int empsalary;
	private int empdeptid;
	private int empmanagerid;
	private int emphrpartnerid;
	private String createdby;
	private Date createdon;
	private String lastupdatedby;
	private Date lastupdatedon;
	
	/**
	 * Default constructor for the entity Employee
	 */
	protected Employee()
	{
		
	}

	/**
	 * toString() implementation for the entity Employee
	 */
	@Override
	public String toString()
	{
		StringBuffer employeeStr = new StringBuffer("Empid: " + this.empid.toString());
		employeeStr.append(" - FN: " + this.empfirstname);
		employeeStr.append(" - LN: " + this.emplastname);
		employeeStr.append(" - MN: " + this.empmiddlename);
		employeeStr.append(" - DOJ: " + this.empdoj.toString());
		employeeStr.append(" - Salary: " + this.empsalary);
		employeeStr.append(" - DeptId: " + this.empdeptid);
		employeeStr.append(" - MgrId: " + this.empmanagerid);
		employeeStr.append(" - HR Id: " + this.emphrpartnerid);
		employeeStr.append(" - created by: " + this.createdby);
		employeeStr.append(" - created on: " + this.createdon.toString());
		employeeStr.append(" - last updated by: " + this.lastupdatedby);
		employeeStr.append(" - last updated on: " + this.lastupdatedon.toString());
		return employeeStr.toString();
	}
	
	@Override
	public int hashCode()
	{
		return this.empid.hashCode();
	}

	/**
	 * @return the empid
	 */
	public BigInteger getEmpid() {
		return empid;
	}

	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(BigInteger empid) {
		this.empid = empid;
	}

	/**
	 * @return the empfirstname
	 */
	public String getEmpfirstname() {
		return empfirstname;
	}

	/**
	 * @param empfirstname the empfirstname to set
	 */
	public void setEmpfirstname(String empfirstname) {
		this.empfirstname = empfirstname;
	}

	/**
	 * @return the emplastname
	 */
	public String getEmplastname() {
		return emplastname;
	}

	/**
	 * @param emplastname the emplastname to set
	 */
	public void setEmplastname(String emplastname) {
		this.emplastname = emplastname;
	}

	/**
	 * @return the empmiddlename
	 */
	public String getEmpmiddlename() {
		return empmiddlename;
	}

	/**
	 * @param empmiddlename the empmiddlename to set
	 */
	public void setEmpmiddlename(String empmiddlename) {
		this.empmiddlename = empmiddlename;
	}

	/**
	 * @return the empdoj
	 */
	public Date getEmpdoj() {
		return empdoj;
	}

	/**
	 * @param empdoj the empdoj to set
	 */
	public void setEmpdoj(Date empdoj) {
		this.empdoj = empdoj;
	}

	/**
	 * @return the empsalary
	 */
	public int getEmpsalary() {
		return empsalary;
	}

	/**
	 * @param empsalary the empsalary to set
	 */
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}

	/**
	 * @return the empdeptid
	 */
	public int getEmpdeptid() {
		return empdeptid;
	}

	/**
	 * @param empdeptid the empdeptid to set
	 */
	public void setEmpdeptid(int empdeptid) {
		this.empdeptid = empdeptid;
	}

	/**
	 * @return the empmanagerid
	 */
	public int getEmpmanagerid() {
		return empmanagerid;
	}

	/**
	 * @param empmanagerid the empmanagerid to set
	 */
	public void setEmpmanagerid(int empmanagerid) {
		this.empmanagerid = empmanagerid;
	}

	/**
	 * @return the emphrpartnerid
	 */
	public int getEmphrpartnerid() {
		return emphrpartnerid;
	}

	/**
	 * @param emphrpartnerid the emphrpartnerid to set
	 */
	public void setEmphrpartnerid(int emphrpartnerid) {
		this.emphrpartnerid = emphrpartnerid;
	}

	/**
	 * @return the createdby
	 */
	public String getCreatedby() {
		return createdby;
	}

	/**
	 * @param createdby the createdby to set
	 */
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	/**
	 * @return the createdon
	 */
	public Date getCreatedon() {
		return createdon;
	}

	/**
	 * @param createdon the createdon to set
	 */
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	/**
	 * @return the lastupdatedby
	 */
	public String getLastupdatedby() {
		return lastupdatedby;
	}

	/**
	 * @param lastupdatedby the lastupdatedby to set
	 */
	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	/**
	 * @return the lastupdatedon
	 */
	public Date getLastupdatedon() {
		return lastupdatedon;
	}

	/**
	 * @param lastupdatedon the lastupdatedon to set
	 */
	public void setLastupdatedon(Date lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}
	
	
	
}
