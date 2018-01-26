package com.kingshing.dao;

import java.util.List;
import com.kingshing.entries.User;

public interface UserDao {
	/**
	 * 根据id查找User
	 * 
	 * @param id
	 * @return User
	 */
	public User selectUserById(Long id);

	/**
	 * 增加一个User用户
	 * 
	 * @param user
	 * @return boolean
	 */
	public boolean insertUser(User user);

	/**
	 * 通过id修改一个User
	 * 
	 * @param id
	 * @return boolean
	 */
	public boolean updateUser(Long id);

	/**
	 * 根据id删除一个User
	 * 
	 * @param id
	 * @return boolean
	 */
	public boolean deleteUserById(Long id);

	/**
	 * 查询所有User
	 * 
	 * @return List<User>
	 */
	public List<User> listAllUser();
}
