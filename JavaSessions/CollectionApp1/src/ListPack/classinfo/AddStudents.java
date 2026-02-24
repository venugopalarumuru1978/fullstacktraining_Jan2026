package ListPack.classinfo;

import java.util.ArrayList;
import java.util.List;

public class AddStudents {

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
		
		System.out.println(stdList);
		
		System.out.println("-----------");
		for(Student st : stdList)
			System.out.println(st);
		
		System.out.println("-----------");
		for(Student st : stdList)
		{
			System.out.println("Roll Number : " + st.getRollno());
			System.out.println("Student Name : " + st.getSname());
			System.out.println("Course  : " + st.getCourse());
			System.out.println("---------------");
		}

	}
}
