package com.tamnxl.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Template;

import com.tamnxl.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
				SessionFactory factory = new Configuration()
										.configure("hibernate.cfg.xml")
										.addAnnotatedClass(Student.class)
										.buildSessionFactory();
				
		// create session
		Session session = factory.getCurrentSession();
				
		try {			
					
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").list();
			
			// display the students
			displayStudent(theStudents);
			
			// query students: name=dat
			theStudents = session.createQuery("from Student s where s.lastName='Dat'").list();
			
			// display the students
			System.out.println("\n\nStudent who has last name of Dat");
			displayStudent(theStudents);
			
			// query students: last name of Dat or first name of nguyen
			theStudents = session.createQuery("from Student s where s.lastName='Dat' "
					+ "or s.firstName='Xuan'").list();
			
			// display the students
			System.out.println("\n\nStudent who has last name of Dat or first name of xuan");
			displayStudent(theStudents);
			
			// query students: where email like  '%luv2code.com
			theStudents = session.createQuery("from Student s where s.email like '%luv2code.com'").list();
						
			// display the students
			System.out.println("\n\nStudent who email end with luv2code.com");
			displayStudent(theStudents);
					
			// commit transaction
			session.getTransaction().commit();
					
			System.out.println("Done!");
		} finally {
				factory.close();
		}

	}

	private static void displayStudent(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
