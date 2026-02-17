import java.util.Scanner;

public class Student 
{
	private	String sname;
	private int sub1, sub2;
	private Scanner  sc = new Scanner(System.in);
	
	void GetStdInfo()
	{
		System.out.println("Student Name : ");
		sname = sc.next();
		System.out.println("Two Subject Marks : ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
	}
	
	void printStdInfo()
	{
		System.out.println("Student name : " + sname);
		System.out.println("Subject - 1 Marks : " + sub1);
		System.out.println("Subject - 2 Marks : " + sub2);
		System.out.println("Total Marks : " + (sub1+sub2));
		System.out.println("Average Marks : " + (sub1+sub2)/2.0f);
		
		if(sub1>=35 && sub2>=35)
			System.out.println(sname + " is Passed");
		else
			System.out.println(sname + " is Failed");
	}
}
