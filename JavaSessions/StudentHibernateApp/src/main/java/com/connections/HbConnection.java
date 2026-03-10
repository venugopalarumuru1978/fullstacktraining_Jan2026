package com.connections;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbConnection {

	public static SessionFactory  GetConnection()
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return  sf;
	}
}
