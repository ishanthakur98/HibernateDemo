package com.crazzycoding.DemoHib;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	User user = new User();
//    	user.setId("2");
    	user.setEmail("ishan@gmail.com");
    	Username username = new Username();
    	username.setFirstname("ishan");
    	username.setMiddlename("singh");
    	username.setLastname("thakur");
    	user.setUsername(username);
    	
    	

    	
    	Laptop l1 = new Laptop();
//    	l1.setId("1");
    	l1.setLaptopname("dell");
    	
    	Laptop l2 = new Laptop();
//    	l1.setId("2");
    	l2.setLaptopname("hp");
//    	l1.setRollno("1");
    	
    	List<Laptop> laptops = Arrays.asList(l1,l2);
    	
    	Student s1 = new Student();
    	s1.setName("ishan");
//    	s1.setRollno("1");
    	s1.setLaptop(laptops);
    	
    
    	Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	
    	
    	
//     	ServiceRegistry registry = new ServiceRegi
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	session.getTransaction().begin();;
    	
//    	session.save(user);
//    	session.save(l1);
//    	session.save(l2);
//    	session.save(s1);
    	
 
    	
    	Long id = 1L;
    	
    	Student student = session.get(Student.class, 1L);
    	
    	System.out.println(student.getName());
    	
    	session.getTransaction().commit();
    	
    	Session session2 = sessionFactory.openSession();
    	session2.getTransaction().begin();
    	
    	
    	Student student2 = session2.get(Student.class, id);
    	session2.getTransaction().commit();
    	
//    	Collection<Laptop> laptops2 = student.getLaptop();
//    	
//    	for(Laptop laptop : laptops2) {
//    		System.out.println(laptop);
//    	}
    	
//    	User users = (User) session.get(User.class, "2");
    	
//    	System.out.println(users);
    	
    	
    	
    	
    }
}
