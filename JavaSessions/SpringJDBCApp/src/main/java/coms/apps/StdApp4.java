package coms.apps;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import coms.DAL.StdDAL;
import coms.beans.Student;

public class StdApp4 {

	public static void main(String[] args) {
	
		ApplicationContext  context = new ClassPathXmlApplicationContext("dbConfig.xml");
		StdDAL sd = (StdDAL)context.getBean("dbConnObj"); 
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Roll Number ");
		int rno = sc.nextInt();
		
		Student s = sd.SearchStd(rno);
		
		if(s!=null)
		{
			System.out.println(s.getRollno() + "\t" + s.getSname() + "\t" + s.getCourse() + "\t" + s.getFees());
			System.out.println("Are u sure(y/n) ");
			String ch = sc.next();
			if(ch.equals("y"))
				sd.DeleteStudent(rno);
		}
		else
			System.out.println("Not Found...");
	}
}
