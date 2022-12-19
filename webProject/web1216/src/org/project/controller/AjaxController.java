package org.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// annotation -> 주석, 코드 자동화, 실행시 특정기능을 실행하도록 정보를 제공
@WebServlet("*.ax")
public class AjaxController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET");
		
		String userId=req.getParameter("userId");
		String userPw=req.getParameter("userPw");
		String userName=req.getParameter("userName");
		
		System.out.println("Id: "+userId);
		System.out.println("Pw: "+userPw);
		System.out.println("Name: "+userName);
		
		PrintWriter out=resp.getWriter();
		
		out.println("Id-> "+userId);
		out.println("Pw-> "+userPw);
		out.println("Name-> "+userName);
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST");
	}
	
}
