package com.jsp.student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.jsp.student.Student;

public class StudentGetAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 EntityManagerFactory entityManagerFactory=
		 Persistence.createEntityManagerFactory("vikas");	
 EntityManager entityManager=entityManagerFactory.createEntityManager();
 
 String sql="SELECT s FROM Student s";
 Query query=entityManager.createQuery(sql);
 
 List<Student> students=query.getResultList();
 for (Student s : students) { 
 System.out.println(s.getId());
 System.out.println(s.getEmail());
 System.out.println(s.getCno());
	}
	}
}
