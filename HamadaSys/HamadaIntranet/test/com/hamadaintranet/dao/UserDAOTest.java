package com.hamadaintranet.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.Test;

import com.hamadaintranet.entity.Users;

public class UserDAOTest {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDAO userDAO;
	
	@BeforeClass
	public static void setUpClass() {
		entityManagerFactory = Persistence.createEntityManagerFactory("HamadaIntranet");
		entityManager = entityManagerFactory.createEntityManager();
		
		userDAO = new UserDAO(entityManager);
	}

	@Test
	public void testCreateUsers() {
		Users user1 = new Users();
		user1.setUserEmail("johannessen@gmail.com");
		user1.setUserFullname("Ragnar Jo");
		user1.setUserPass("odin@2020");
		
		user1 = userDAO.create(user1);
		
		assertTrue(user1.getUserId() > 0);
	}

	@Test(expected = PersistenceException.class)
	public void testCreateUsersFieldsNotSet() {
		Users user1 = new Users();
		user1 = userDAO.create(user1);
	}
	
	@Test 
	public void testUpdateUsers() {
		Users user = new Users();
		user.setUserId(1);
		user.setUserEmail("ragnarjohann@gmail.com");
		user.setUserPass("odin@2021");
		user.setUserFullname("Ragnar Johann");
		
		user = userDAO.update(user);
		String expected = "odin@2021";
		String actual = user.getUserPass();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetUsersFound() {
		Integer userID = 1;
		Users user = userDAO.get(userID);
		
		if (user != null) {
		System.out.println(user.getUserEmail());
		}
		
		assertNotNull(user);
	}
	
	@Test
	public void testGetUsersNotFound() {
		Integer userID = 99;
		Users user = userDAO.get(userID);
		
		assertNull(user);
	}
	
	@Test
	public void testDeleteUsers() {
		Integer userID = 5;
		userDAO.delete(userID);
		
		Users user = userDAO.get(userID);
		
		assertNull(user);
		
	}
	
	@Test(expected = EntityNotFoundException.class)
	public void testDeleteNonExistUsers() {
		Integer userID = 55;
		userDAO.delete(userID);
		 
	}
	
	@Test
	public void testListAll() {
		List<Users> listUsers = userDAO.listAll();
		assertTrue(listUsers.size() > 0);
	}
	
	@AfterClass
		public static void tearDownClass() {
		
		entityManager.close();
		entityManagerFactory.close();
	}
	
}