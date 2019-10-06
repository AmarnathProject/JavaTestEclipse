package com.webx.minuts.Service;

import java.util.List;

import com.webx.minuts.Model.User;

public interface UserService {


	public List<User> getUserList();

	public User getUserById(int uid);

	public void addUser(User user);

	public void deleteUser(User user);


}
