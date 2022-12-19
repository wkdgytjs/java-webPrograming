package org.project.dto;

public class MemberDto {

	private String userid;
	private String userPw;
	private String userName;
	
	public MemberDto(String userid, String userPw, String userName) {
		super();
		this.userid = userid;
		this.userPw = userPw;
		this.userName = userName;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
