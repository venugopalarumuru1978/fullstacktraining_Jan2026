package coms.beans;

public class Student {

	private int rollno;
	private String sname;
	private String course;
	private float fees;

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("rollno");
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		System.out.println("sname");
		this.sname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
		System.out.println("course");
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
		System.out.println("fees");
	}
}
