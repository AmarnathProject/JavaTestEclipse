package com.webx.minuts.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webx.minuts.Dao.UserDao;
import com.webx.minuts.Model.UserEntity;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List<UserEntity> getUserList() {

		return userDao.getUserList();
	}

	public UserEntity getUserById(int uid) {

		return userDao.getUserById(uid);
	}

	public void addUser(UserEntity user) {
		userDao.addUser(user);

	}

	public void deleteUser(UserEntity user) {

		userDao.addUser(user);

	}

}
