package coms.testpack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		Student std = new Student();
		std.setRollno(1002);
		std.setSname("Nagveni");
		std.setCourse("Java FSD");
		std.setFees(20000.00f);
		
		session.persist(std);
		trans.commit();
		
		System.out.println("Student is Added...");
		
		
	}

}
