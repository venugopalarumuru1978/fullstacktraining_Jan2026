package coms.apps;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.DAL.StdDAL;
import coms.beans.Student;

public class StdApp1 {

	public static void main(String[] args) {
	
		ApplicationContext  context = new ClassPathXmlApplicationContext("dbConfig.xml");
		StdDAL sd = (StdDAL)context.getBean("dbConnObj"); 
		
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.println("Roll Number ");
		std.setRollno(sc.nextInt());

		System.out.println("Student Name ");
		std.setSname(sc.next());
		
		System.out.println("Student Course");
		std.setCourse(sc.next());
		
		System.out.println("Course Fees ");
		std.setFees(sc.nextFloat());
		
		sd.AddNewStudent(std);
		
	}

}
