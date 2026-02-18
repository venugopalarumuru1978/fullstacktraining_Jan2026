package AssignmentPack;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {

		Student std = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Student ID");
		int sid = sc.nextInt();
		
		System.out.println("Student Name ");
		String sname = sc.next();
		
		System.out.println("Student Address ");
		String adrs = sc.next();
		
		while(true)
		{
			System.out.println("Weather std is from NIT or Not(yes/no) ");
			String ch = sc.next();
			
			if(ch.equalsIgnoreCase("yes") || ch.equalsIgnoreCase("no"))
			{
				if(ch.equalsIgnoreCase("Yes"))
				{
					std = new Student(sid, sname, adrs);
				}
				if(ch.equalsIgnoreCase("No"))
				{
					System.out.println("College Name : ");
					String cname = sc.next();
					
					std = new Student(sid, sname, adrs, cname);			
				}
				System.out.println("Student ID : " + std.getStudentId());
				System.out.println("Student Name : " + std.getStudentName());
				System.out.println("Student Address : " + std.getStudentAddress());
				System.out.println("Student College : " + std.getCollegeName());
				break;
			}
			else
				System.out.println("Wrong Input");
		}
	}
}
