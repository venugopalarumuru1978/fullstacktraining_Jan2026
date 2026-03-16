package coms.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	private String ename;
	private String job;
	private float sal;
	
	private Account acc;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public Account getAcc() {
		return acc;
	}
	
	@Autowired(required=true)
	@Qualifier("acc1")
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void printEmpInfo()
	{
		System.out.println("Emp Name : " + this.getEname());
		System.out.println("Emp Job : " + this.getJob());
		System.out.println("Emp Salary : " + this.getSal());
		System.out.println("Acc Number : " + this.getAcc().getAccNo());
		System.out.println("Bank Name : " + this.getAcc().getBankName());
	}
}
