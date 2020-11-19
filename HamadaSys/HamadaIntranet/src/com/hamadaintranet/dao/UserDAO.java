package com.hamadaintranet.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.hamadaintranet.entity.Users;

public class UserDAO extends JpaDAO<Users> implements GenericDAO<Users> {

	public UserDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	public Users create(Users user) {
		return super.create(user);
	}

	@Override
	public Users update(Users user) {
		
		return super.update(user);
	}

	@Override
	public Users get(Object userID) {
		return super.find(Users.class,  userID);
	}

	@Override
	public void delete(Object userID) {
		super.delete(Users.class, userID);
	}

	@Override
	public List<Users> listAll() {
		return super.findWithNamedQuery("Users.findAll");
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
