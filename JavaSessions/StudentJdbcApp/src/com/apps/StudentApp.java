package com.apps;

import java.util.List;
import java.util.Scanner;

import com.DAO.StdOperations;
import com.models.Student;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stdObj = null;
		StdOperations  sop = new StdOperations();
		
		while(true)
		{
			System.out.println("1. Add New Student\n2. Show All Students\n3. Search Students\n4. Update Student name\n5. Delete Student\n6. Exit");
			System.out.println("Pick ur Choice ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					stdObj = new Student();
					System.out.println("Roll Number");
					stdObj.setRollno(sc.nextInt());
					System.out.println("Student Name");
					stdObj.setSname(sc.next());
					System.out.println("Course Name");
					stdObj.setCourse(sc.next());
					System.out.println("Fees");
					stdObj.setFees(sc.nextFloat());
					sop.AddNewStudent(stdObj);
					break;
				case 2:
					List<Student>  stdList = sop.ShowAll();
					
					for(Student s : stdList)
					{
						System.out.println(s.getRollno());
						System.out.println(s.getSname());
						System.out.println(s.getCourse());
						System.out.println(s.getFees());
						System.out.println("---------");
					}
					break;
				case 3:
					System.out.println("Enter Roll Number ");
					int rno = sc.nextInt();
					
					stdObj = sop.SearchStudent(rno);
					if(stdObj!=null)
					{
						System.out.println(stdObj.getRollno());
						System.out.println(stdObj.getSname());
						System.out.println(stdObj.getCourse());
						System.out.println(stdObj.getFees());						
					}
					else
						System.out.println("Student Not Found....");
					break;
				case 4:
					System.out.println("Enter Roll Number ");
					rno = sc.nextInt();
					
					stdObj = sop.SearchStudent(rno);
					if(stdObj!=null)
					{
						System.out.println("Present Name : " + stdObj.getSname());
						System.out.println("Enter new name to Modify ");
						stdObj.setSname(sc.next());
						sop.UpdateStd(stdObj.getSname(), stdObj.getRollno());
					}
					else
						System.out.println("Student Not Found....");
					break;
				case 5:
					System.out.println("Enter Roll Number ");
					rno = sc.nextInt();
					
					stdObj = sop.SearchStudent(rno);
					if(stdObj!=null)
					{
						sop.DeleteStd(rno);
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
