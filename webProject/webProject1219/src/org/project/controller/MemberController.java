package org.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.JoinOkDo;
import org.project.commend.MemberCommend;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;

@WebServlet("*.do")
public class MemberController extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET");
		//한글처리
		response.setCharacterEncoding("UTF-8");
		doPost(request, response);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST");
		request.setCharacterEncoding("UTF-8");
		String basicPath=request.getContextPath();//기본 경로
		String uri=request.getRequestURI();//요청 URI
		String userURL=uri.substring(basicPath.length());// /*/*.do*
		
		String url="";
		
		MemberCommend commend;
		
		if(userURL.equals("/memberInsert.do")) {
			commend=new MemberInsertDo();
			commend.excuteQueryCommend(request, response);			
		}else if(userURL.equals("/memberSelect.do")) {
			commend=new MemberSelectDo();
			commend.excuteQueryCommend(request, response);
		}else if(userURL.equals("/memberUpdate.do")) {
			commend=new MemberUpdateDo();
			commend.excuteQueryCommend(request, response);
		}else if(userURL.equals("/memberDelete.do")) {
			commend=new MemberDeleteDo();
			commend.excuteQueryCommend(request, response);
		}else if(userURL.equals("/joinOk.do")) {
			commend=new JoinOkDo();
			commend.excuteQueryCommend(request, response);
		}
		
		//View -> 클라이언트 요청 응답 -> HTML
//		PrintWriter out=response.getWriter();
////		response.setContentType("text/html;charset=UTF-8");
//		response.setCharacterEncoding("UTF-8");
//		
//		out.println("<!doctype html>");
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta charset='UTF-8'>");
//		out.println("<title>서블릿 실습</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>서블릿</h1>");
//		out.println("아이디: "+userId+"<br>");
//		out.println("비밀번호: "+userPw+"<br>");
//		out.println("이메일: "+email);
//		out.println("</body>");
//		out.println("</html>");
//		out.close();
	}
}
