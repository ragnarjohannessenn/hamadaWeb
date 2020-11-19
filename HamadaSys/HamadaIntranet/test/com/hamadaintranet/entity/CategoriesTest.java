package com.hamadaintranet.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hamadaintranet.entity.Users;
public class CategoriesTest {

	public static void main(String[] args) {
		
		Categories newCat = new Categories(1, "Suplementos");
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("HamadaIntranet");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(newCat);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		System.out.println("A Category object was persisted");
	}

}
