package com.apps;

import java.util.List;
import java.util.Scanner;

import com.DAL.StudentOperations;
import com.entities.Student;

public class StudentApp {

	public static void main(String[] args)
	{
		StudentOperations  sop = new StudentOperations();
		Student std = null;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add New Student\n2. Show All Students\n3. Search Student\n4. Update Student\n5. Delete Student\n6. Exit");
			System.out.println("Pick Ur Choice ");
			int ch =sc.nextInt();
			
			switch(ch)
			{
			case 1:
				std = new Student();
				System.out.println("Roll Number ");
				std.setRollno(sc.nextInt());
				System.out.println("Student Name ");
				std.setSname(sc.next());
				System.out.println("Student Course ");
				std.setCourse(sc.next());
				System.out.println("Course Fees ");
				std.setFees(sc.nextFloat());
				
				sop.AddNewStudent(std);
				break;
			case 2:
				List<Student> stdList = sop.ShowAll();
				for(Student s :stdList)
					System.out.println(s.getRollno() + "\t" + s.getSname() + "\t" + s.getCourse() + "\t" + s.getFees());
				break;
			case 3:
				System.out.println("Enter Roll Number ");
				int rno = sc.nextInt();
				Student s = sop.SearchStudent(rno);
				if(s!=null)
					System.out.println(s.getRollno() + "\t" + s.getSname() + "\t" + s.getCourse() + "\t" + s.getFees());
				else
					System.out.println("Student Not Found....");
				break;
			case 4:
				System.out.println("Enter Roll Number ");
				rno = sc.nextInt();
				s = sop.SearchStudent(rno);
				if(s!=null)
				{
					System.out.println("Present Name : " + s.getSname());
					System.out.println("New name of Student");
					String sname = sc.next();
					sop.UpdateStudentName(rno, sname);
				}
				else
					System.out.println("Student Not Found....");
				break;
			case 5:
				System.out.println("Enter Roll Number ");
				rno = sc.nextInt();
				s = sop.SearchStudent(rno);
				if(s!=null)
				{
					System.out.println("Present Name : " + s.getSname());
					sop.DeleteStudent(rno);
				}
				else
					System.out.println("Student Not Found....");
				break;
			case 6:
				System.out.println("Thanks for using App");
				System.exit(0);
			}
		}
	}
}
