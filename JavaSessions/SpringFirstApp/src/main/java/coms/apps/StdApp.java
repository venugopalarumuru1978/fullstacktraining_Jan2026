package coms.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.beans.Student;

public class StdApp {

	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("beanConfig.xml");
		Student std =  (Student)context.getBean("stdObj");

		System.out.println(std.getRollno());
		System.out.println(std.getSname());
		System.out.println(std.getCourse());
		System.out.println(std.getFees());
		
		
	}

}
