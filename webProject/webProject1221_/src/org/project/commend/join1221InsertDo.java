package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class join1221InsertDo implements SQLCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("회원가입 실행");
		
		String userId=request.getParameter("userId");
		String userPw=request.getParameter("userPw");
		String gender=request.getParameter("gender");
		String[] hobbys=request.getParameterValues("hobbys");
		String hobbysArr = "";
		for (String hobby : hobbys) {
			hobbysArr += hobby + " ";
		}
		String hometown=request.getParameter("hometown");
		String memo=request.getParameter("memo");
		
		
		MemberDao dao=MemberDao.getInstance();
		int result=dao.join1221InsertDo(userId,userPw,gender,hobbysArr,hometown,memo);
		
		String fowardURL="";
		
		if(result!=1) {
			System.out.println("회원가입Fail");
			fowardURL="/index1221.jsp";
		}else {
			System.out.println("회원가입Success");
			fowardURL="/login1221.jsp";
		}
		request.setAttribute("fowardURL", fowardURL);
		
	}

}
