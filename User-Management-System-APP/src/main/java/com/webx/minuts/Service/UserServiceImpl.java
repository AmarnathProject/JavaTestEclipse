package com.webx.minuts.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webx.minuts.Dao.UserDao;
import com.webx.minuts.Model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public List<User> getUserList() {

		return userDao.getUserList();
	}

	public User getUserById(int uid) {

		return userDao.getUserById(uid);
	}

	public void addUser(User user) {
		userDao.addUser(user);

	}

	public void deleteUser(User user) {

		userDao.addUser(user);

	}

}
