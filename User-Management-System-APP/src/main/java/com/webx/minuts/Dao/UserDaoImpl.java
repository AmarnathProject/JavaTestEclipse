package com.webx.minuts.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.webx.minuts.Model.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory factory;

	// get List of Users
	@SuppressWarnings("unchecked")
	public List<User> getUserList() {

		return (List<User>) factory.getCurrentSession().createCriteria(User.class).list();
	}

	// get user by specific id
	public User getUserById(int uid) {

		return (User) factory.getCurrentSession().get(User.class, uid);
	}

	// Add the user
	public void addUser(User user) {

		factory.getCurrentSession().saveOrUpdate(user);
	}

	// delete user by id
	public void deleteUser(User user) {
		factory.getCurrentSession().createQuery("DELETE FROM UserEntity WHERE uid = " + user.getId()).executeUpdate();

	}
	/*
	 * // Editing user details public void edit(UserEntity user) {
	 * 
	 * Session session = factory.getCurrentSession();
	 * 
	 * UserEntity existingUser = (UserEntity) session.get(UserEntity.class,
	 * user.getId());
	 * 
	 * existingUser.setName(user.getName());
	 * existingUser.setPanCard_Number(user.getPanCard_Number());
	 * existingUser.setAdharCard_Number(user.getAdharCard_Number());
	 * existingUser.setEmail(user.getEmail());
	 * existingUser.setPhone_Number(user.getPhone_Number());
	 * 
	 * existingUser.setAddress(user.getAddress());
	 * 
	 * session.save(existingUser);
	 * 
	 * }
	 */


}
