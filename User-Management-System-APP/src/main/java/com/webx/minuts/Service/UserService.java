package com.webx.minuts.Service;

import java.util.List;

import com.webx.minuts.Model.UserEntity;

public interface UserService {


	public List<UserEntity> getUserList();

	public UserEntity getUserById(int uid);

	public void addUser(UserEntity user);

	public void deleteUser(UserEntity user);


}
