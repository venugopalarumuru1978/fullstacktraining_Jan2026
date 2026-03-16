package coms.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.beans.Employee;

public class EmpApp {

	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("empConfig.xml");
		Employee emp = (Employee)context.getBean("empObj");
		emp.printEmpInfo();
	}
}
