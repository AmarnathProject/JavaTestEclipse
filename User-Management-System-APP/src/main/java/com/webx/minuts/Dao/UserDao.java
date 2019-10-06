package com.webx.minuts.Dao;

import java.util.List;

import com.webx.minuts.Model.User;

public interface UserDao {

	public List<User> getUserList();

	public User getUserById(int uid);

	public void addUser(User user);

	public void deleteUser(User user);


}
