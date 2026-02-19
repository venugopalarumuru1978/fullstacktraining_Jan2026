package InheritPack;


class Student
{
	protected String sname, course;
	
	public void getStd(String sname, String course)
	{
		this.sname = sname;
		this.course = course;
	}
}

class Marks extends Student
{

	protected int sub1, sub2;
	
	public void getMarks(int sub1, int sub2)
	{
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
}


class Results extends Marks
{
	
	public void printResult()
	{
		System.out.println("Student Name : " + sname);
		System.out.println("Student Course : " + course);
		System.out.println("Sub1 Marks : " + sub1);
		System.out.println("Sub2 Marks : " + sub2);
		System.out.println("Total  : " + (sub1+sub2));
	}
}

public class multiLevelMain {

	public static void main(String[] args) {
		Results  r1 = new Results();
		r1.getStd("Pavan", "Java");
		r1.getMarks(56,78);
		r1.printResult();
	}
}
