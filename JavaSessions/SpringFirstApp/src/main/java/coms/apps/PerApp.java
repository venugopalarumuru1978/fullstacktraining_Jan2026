package coms.apps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.beans.Person;
import coms.beans.Student;

public class PerApp {

	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("beanConfig.xml");
		Person person = (Person)context.getBean("perObj");
		
		System.out.println(person.getPname());
		System.out.println(person.getEmail());
		
	}

}
