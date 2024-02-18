package com.crazzycoding.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserApp {
	
	public static void main(String[] args) {
		
		User user = new User();
    	user.setId("3");
    	user.setEmail("ishan@gmail.com");
    	Username username = new Username();
    	username.setFirstname("ishan");
    	username.setMiddlename("singh");
    	username.setLastname("thakur");
    	user.setUsername(username);
    	
Configuration configuration = new Configuration().configure().addAnnotatedClass(User.class);
    	
    	
    	
//     	ServiceRegistry registry = new ServiceRegi
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
//    	Session session = sessionFactory.openSession();
//    	
//    	session.getTransaction().begin();
//    	
//    	session.save(user);
//    	
//    	session.getTransaction().commit();
    	
    	Session session2 = sessionFactory.openSession();
    	
    	session2.getTransaction().begin();
    	
    	session2.get(User.class, "3");
    	
    	session2.getTransaction().commit();
    	
    	Session session3 = sessionFactory.openSession();
    	
    	session3.getTransaction().begin();
    	
    	session3.get(User.class, "1");
    	
    	session3.getTransaction().commit();
    	
	}

}
