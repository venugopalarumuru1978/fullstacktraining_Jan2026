package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Connections.DbConnection;
import com.models.Student;

public class StdOperations {

	private Connection conObj = null;
	private PreparedStatement  psObj = null;
	
	public StdOperations()
	{
		conObj =  DbConnection.getConnection();
	}
	
	public void AddNewStudent(Student std)
	{
		try {
			psObj = conObj.prepareStatement("INSERT INTO STUDENT(ROLLNO, SNAME, COURSE, FEES) VALUES(?,?,?,?)");
			psObj.setInt(1, std.getRollno());
			psObj.setString(2, std.getSname());
			psObj.setString(3, std.getCourse());
			psObj.setFloat(4, std.getFees());
			psObj.executeUpdate();
			System.out.println("Student is Added....");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	public List<Student> ShowAll()
	{
		List<Student>  stdList = new ArrayList<Student>();
		Student std = null;
		try {
			psObj = conObj.prepareStatement("select * from student");
			ResultSet  rs = psObj.executeQuery();
			while(rs.next())
			{
				std = new Student(rs.getInt("rollno"), rs.getString("sname"), rs.getString("course"), rs.getFloat("fees"));
				stdList.add(std);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return stdList;
	}
	public Student  SearchStudent(int rno)
	{
		Student std = null;
		try {
			psObj = conObj.prepareStatement("select * from student where rollno=?");
			psObj.setInt(1, rno);
			ResultSet  rs = psObj.executeQuery();
			if(rs.next())
			{
				std = new Student(rs.getInt("rollno"), rs.getString("sname"), rs.getString("course"), rs.getFloat("fees"));				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return std;
	}

	public void DeleteStd(int rno)
	{
		try {
			psObj = conObj.prepareStatement("DELETE FROM STUDENT WHERE ROLLNO = ?");
			psObj.setInt(1, rno);
			psObj.executeUpdate();
			System.out.println("Student is Deleted....");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}		
	}
	
	public void UpdateStd(String sname, int rno)
	{
		try {
			psObj = conObj.prepareStatement("UPDATE STUDENT SET SNAME=? WHERE ROLLNO = ?");
			psObj.setString(1, sname);
			psObj.setInt(2, rno);
			psObj.executeUpdate();
			System.out.println("Student Name is Modified....");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}		
	}
}
