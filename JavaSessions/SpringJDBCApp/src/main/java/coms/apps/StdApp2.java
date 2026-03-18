package coms.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.DAL.StdDAL;
import coms.beans.Student;

public class StdApp2 {

	public static void main(String[] args) {
	
		ApplicationContext  context = new ClassPathXmlApplicationContext("dbConfig.xml");
		StdDAL sd = (StdDAL)context.getBean("dbConnObj"); 

		List<Student> stdList = sd.ShowAll();
		
		for(Student s : stdList)
			System.out.println(s.getRollno() + "\t" + s.getSname() + "\t" + s.getCourse() + "\t" + s.getFees());
	}

}
