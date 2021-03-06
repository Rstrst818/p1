package com.cg.jh2.ui;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh2.entity.Employee;
import com.cg.jh2.entity.Laptop;
import com.cg.jh2.util.JPAUtil;

public class App01 {
	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		Laptop lap1=new Laptop("HP");
		Employee emp1=new Employee("Sai","tarun",lap1);
		Laptop lap2=new Laptop("Dell");
		Employee emp2=new Employee("tarun","sai",lap2);
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(emp1);
		em.persist(emp2);
		em.persist(lap1);
		em.persist(lap2);
		txn.commit();
		
		JPAUtil.shutdown();
		
	}

}