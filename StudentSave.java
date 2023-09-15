package com.jsp.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentSave{
	public static void main(String[] args) {
		
	EntityManagerFactory entityManagerFactory
	=Persistence.createEntityManagerFactory("vikas");

	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student student=new Student();
	student.setId(3);
	student.setName("omkar");
	student.setEmail("omkar@mail.com");
	student.setCno(930704563);
	
	entityTransaction.begin();
	entityManager.persist(student);
	entityTransaction.commit();
	}
}