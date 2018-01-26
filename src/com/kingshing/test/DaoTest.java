package com.kingshing.test;


import java.util.Date;
import java.util.List;
import org.junit.Test;

import com.kingshing.dao.UserDao;
import com.kingshing.dao.impl.UserDaoImpl;
import com.kingshing.entries.User;

public class DaoTest {
	private UserDao u = new UserDaoImpl();
	private Date date = new Date();
	private User user = new User(null, "张三", date, "1231", "xxxas");

	@Test
	public void testAdd() throws Exception {
		u.insertUser(user);
	}

	@Test
	public void testQueryOne() throws Exception {
		System.out.println(u.selectUserById(1L));
	}

	@Test
	public void testListAll() throws Exception {
		List<User> list = u.listAllUser();
		for (User s : list) {
			System.out.println(s);
		}
	}
}
