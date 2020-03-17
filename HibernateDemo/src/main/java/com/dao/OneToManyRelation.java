package com.dao;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojo.CustomerPojo;
import com.pojo.VendorPojo;

public class OneToManyRelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session s=new Configuration().configure("HibernateDemo.cfg.xml").buildSessionFactory().openSession();
		Transaction t=s.beginTransaction();
		VendorPojo v=new VendorPojo();
		v.setVid1(11);
		v.setVname1("ZOHO");
		v.setEmail("admin@zoho.com");
		CustomerPojo c1=new CustomerPojo();
		c1.setCustid(67);
		c1.setCustname("Kanishka");
		CustomerPojo c2=new CustomerPojo();
		c2.setCustid(66);
		c2.setCustname("Thananya");
		Set s11=new HashSet();
		s11.add(c1);
		s11.add(c2);
		v.setCust1(s11);//one VENDOR to many CUSTOMERS
		s.save(v);//==s.persist()
		t.commit();
		s.close();//detached
		System.out.println("One to Many Done..!!");

	}

}
