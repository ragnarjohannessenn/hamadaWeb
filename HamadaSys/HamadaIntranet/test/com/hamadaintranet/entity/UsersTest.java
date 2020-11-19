package com.hamadaintranet.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hamadaintranet.entity.Users;
public class UsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users user1 = new Users();
		user1.setUserEmail("patrweiz@gmail.com");
		user1.setUserFullname("Patrick Weizmann");
		user1.setUserPass("odin@2020");
		;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HamadaIntranet");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(user1);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A Users object was persisted");
	}

}
