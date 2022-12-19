package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsertDo implements MemberCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원가입");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String email=request.getParameter("email");
		
//		MemberDao dao=new MemberDao();
		MemberDao dao=MemberDao.getInstance();
		
		int result=dao.inserDo(userId,userPw,email);
		
		if(result!=1) {
			System.out.println("회원가입 Fail");
		}else {
			System.out.println("회원가입 Success");
		}
		
	}

}
