package com.kingshing.entries;

import java.util.Date;

/**
 * User entry
 * 
 * @author kingshing
 *
 */
public class User {
	private Long userId;
	private String userName;
	private Date userBornDate;
	private String userPswd;
	private String userIntro;
	public User() {}
	

	public User(Long userId, String userName, Date userBornDate, String userPswd, String userIntro) {
		this.userId = userId;
		this.userName = userName;
		this.userBornDate = userBornDate;
		this.userPswd = userPswd;
		this.userIntro = userIntro;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUserBornDate() {
		return userBornDate;
	}

	public void setUserBornDate(Date userBornDate) {
		this.userBornDate = userBornDate;
	}

	public String getUserPswd() {
		return userPswd;
	}

	public void setUserPswd(String userPswd) {
		this.userPswd = userPswd;
	}

	public String getUserIntro() {
		return userIntro;
	}

	public void setUserIntro(String userIntro) {
		this.userIntro = userIntro;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userBornDate=" + userBornDate + ", userPswd="
				+ userPswd + ", userIntro=" + userIntro + "]";
	}

}
