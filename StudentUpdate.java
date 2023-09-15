package com.jsp.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   EntityManagerFactory entityManagerFactory=
		   Persistence.createEntityManagerFactory("vikas");
   EntityManager entityManager=entityManagerFactory.createEntityManager();
   EntityTransaction entityTransaction=entityManager.getTransaction();
   
   Student student=entityManager.find(Student.class,3);
   student.setCno(885699795);
   
   entityTransaction.begin();
   entityManager.merge(student);
   entityTransaction.commit();
	}

}
