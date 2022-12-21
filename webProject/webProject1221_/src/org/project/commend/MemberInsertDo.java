package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class MemberInsertDo implements SQLCommend{

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원가입");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String email=request.getParameter("email");
		
		MemberDao dao=MemberDao.getInstance();
		int result=dao.insertDo(userId,userPw,email);
		
		String fowardURL="";
		
		if(result!=1) {
			System.out.println("회원가입 Fail");
			fowardURL="/index.jsp";
		}else {
			System.out.println("회원가입 Succsse");			
			fowardURL="/login.jsp";
		}
		request.setAttribute("result", result);// 결과값도같이 담아서
		request.setAttribute("fowordURL", fowardURL);//request 객체에 담음
		
		
	}

}
