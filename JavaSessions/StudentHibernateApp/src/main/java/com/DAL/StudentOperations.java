package com.DAL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connections.HbConnection;
import com.entities.Student;

import jakarta.persistence.TypedQuery;

public class StudentOperations {

	public SessionFactory sf = null;
	Session session = null;
	public StudentOperations()
	{
		sf = HbConnection.GetConnection();
	}
	
	public void AddNewStudent(Student std)
	{
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.persist(std);
		trans.commit();
		System.out.println("New Student is Added...");
	}
	
	public void DeleteStudent(int rollno)
	{
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		TypedQuery<Student>  qry = session.createQuery("Delete from Student where rollno=:rn");
		qry.setParameter("rn", rollno);
		qry.executeUpdate();
		trans.commit();
		System.out.println("Student is Deleted...");
	}

	public void UpdateStudentName(int rollno, String sname)
	{
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		TypedQuery<Student>  qry = session.createQuery("Update Student set sname=:sna where rollno=:rn");		
		qry.setParameter("rn", rollno);
		qry.setParameter("sna", sname);
		qry.executeUpdate();
		trans.commit();
		System.out.println("Student Name is Updated...");
	}

	public List<Student> ShowAll()
	{
		session = sf.openSession();
		TypedQuery<Student>  query = session.createQuery("from Student");
		
		List<Student>  stdList = query.getResultList();
		return stdList;
	}
	
	public Student SearchStudent(int rollno)
	{
		session = sf.openSession();
		TypedQuery<Student>  query = session.createQuery("from Student where rollno=:rn");
		query.setParameter("rn", rollno);
		List<Student>  stdList = query.getResultList();
		
		if(stdList.isEmpty())
			return null;
		
		return stdList.get(0);
	}	
}
