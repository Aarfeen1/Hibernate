package com.xworkz.mouse.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.mouse.dto.MouseDTO;
import com.xworkz.singleconnection.SingleSessionFactory;

public class MouseDAOImp  implements MouseDAO{

	@Override
	public void saveMouse(MouseDTO mouseDto) { 
		System.out.println("invoking save");
		Session session=null;
		try {
Configuration conn=new Configuration();
SessionFactory fact=conn.buildSessionFactory();
session=fact.openSession();
	session.beginTransaction();		
		session.save(mouseDto);
		session.getTransaction().commit();
		fact.close();
			
		}catch (Exception e) {

			// TODO: handle exception
e.printStackTrace();		}
		
	}

}
