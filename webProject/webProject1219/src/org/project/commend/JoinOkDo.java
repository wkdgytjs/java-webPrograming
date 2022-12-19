package org.project.commend;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.dao.MemberDao;

public class JoinOkDo implements MemberCommend {

	@Override
	public void excuteQueryCommend(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("form 회원가입 예제");

		String userId = request.getParameter("userId");
		String userPw = request.getParameter("userPw");
		String userName = request.getParameter("userName");
		String gender = request.getParameter("gender");
		// 다중데이터 -> 취미
		String[] hobbys = request.getParameterValues("hobbys");
		String hobbysArr = "";
		for (String hobby : hobbys) {
			hobbysArr += hobby + " ";
		}
		
		// 다중데이터 -> 전화번호
		String[] phone = request.getParameterValues("phone");
		String phoneArr = "";
		for (String p : phone) {
			phoneArr += p + " ";
		}
		String memo = request.getParameter("memo");

			System.out.println("userId: " + userId);
			System.out.println("userPw: " + userPw);
			System.out.println("userName: " + userName);
			System.out.println("gender: " + gender);
			System.out.println("hobbys: " + hobbysArr);
			System.out.println("phone: " + phoneArr);
			System.out.println("memo: " + memo);
			
			
			MemberDao dao=MemberDao.getInstance();
			int result=dao.joinOkDo(userId,userPw,userName,gender,hobbysArr,phoneArr,memo);
			
			if(result!=1) {
				System.out.println("회원가입 Fail");
			}else {
				System.out.println("회원가입 Success");
			}

	}
}
