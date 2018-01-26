package com.kingshing.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kingshing.dao.UserDao;
import com.kingshing.entries.User;
import com.kingshing.util.SessionUtil;

public class UserDaoImpl implements UserDao {
	private String userPath = "com.kingshing.dao.UserDao";

	@Override
	public User selectUserById(Long id) {
		SqlSession s = SessionUtil.getSession(true);
		User u = s.selectOne(userPath + ".selectOne", id);
		s.close();
		return u;
	}

	@Override
	public boolean insertUser(User user) {
		SqlSession s = SessionUtil.getSession(true);
		int rows = s.insert(userPath + ".insertUser", user);
		s.close();
		return rows > 0;
	}

	@Override
	public boolean updateUser(Long id) {
		SqlSession s = SessionUtil.getSession(true);
		int rows = s.update(userPath + ".updateUser", id);
		return rows > 0;
	}

	@Override
	public boolean deleteUserById(Long id) {
		SqlSession s = SessionUtil.getSession(true);
		int rows = s.delete(userPath + ".deleteUser", id);
		return rows > 0;
	}

	@Override
	public List<User> listAllUser() {
		SqlSession s = SessionUtil.getSession(true);
		List<User> list = s.selectList(userPath + ".selectList");
		s.close();
		return list;
	}

}
