package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.project.dao.MemberDao;

public class LoginOk1221Do implements SQLCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("로그인");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		
		MemberDao dao=MemberDao.getInstance();
		int result=dao.loginOk1221Do(userId,userPw);
		
		String fowardURL="";
		
		HttpSession session=request.getSession();//세션객체생성
		
		if(result!=1) {
			System.out.println("로그인Fail");
			fowardURL="/login1221.jsp";
		}else {
			System.out.println("로그인Success");
			session.setMaxInactiveInterval(60*30);//세션 시간 설정30분
			session.setAttribute("session", userId);//세션아이디 설정
			fowardURL="/login1221Success.jsp";
		}
		request.setAttribute("fowardURL", fowardURL);
	}

}
