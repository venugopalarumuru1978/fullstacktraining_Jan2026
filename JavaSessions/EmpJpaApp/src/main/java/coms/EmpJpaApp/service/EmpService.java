package coms.EmpJpaApp.service;

import java.util.List;

import coms.EmpJpaApp.beans.Employee;

public interface EmpService {
	public void AddEmp(Employee emp);
	public List<Employee> ViewAll();
	public Employee SearchEmp(int eno);
	public void DeleteEmp(int eid);
	public void UpdateEmp(Employee emp);
	
	public Employee  UserCheck(String user, String pwd);
}
