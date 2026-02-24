package ListPack.classinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteStudent {

	public static void main(String[] args) {
		
		List<Student>  stdList = new ArrayList<Student>();
		Student std = new Student(101, "Ravi", "Java");
		stdList.add(std);
		std = new Student(102, "Kavi", "Java");
		stdList.add(std);
		std = new Student(103, "Bavi", "Python");
		stdList.add(std);
		std = new Student(104, "Lavi", "Python");
		stdList.add(std);
		std = new Student(105, "Kovi", "Java");
		stdList.add(std);
		
		
		System.out.println("-----------");
		for(Student st : stdList)
			System.out.println(st);
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter roll number ");
		int rno = sc.nextInt();
		
		System.out.println("-----------");
		boolean stdchk = false;
		for(Student st : stdList)
		{
			if(st.getRollno()==rno)
			{
				stdchk = true;
				stdList.remove(st);
				break;
			}
		}
		
		if(stdchk==false)
			System.out.println("No Students exist with given course");
		else
		{
			for(Student st : stdList)
				System.out.println(st);			
		}
	}
}
