package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.project.commend.LoginOk1221Do;
import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;
import org.project.commend.SQLCommend;
import org.project.commend.join1221InsertDo;


@SuppressWarnings("serial")
@WebServlet("*.do")
public class MemberController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("GET");
		doWeb(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		System.out.println("POST");
		doWeb(request,response);
	}

	private void doWeb(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path=request.getContextPath();
		String uri=request.getRequestURI();
		String basicURL=uri.substring(path.length());
		
		String fowardURL="";//컨트롤러에서 View로 연결
		
		SQLCommend commend;
		
		if(basicURL.equals("/memberInsert.do")) {
			
			commend=new MemberInsertDo();
			commend.excuteQueryCommend(request, response);
			fowardURL=(String) request.getAttribute("fowardURL");
			
		}else if(basicURL.equals("/memberSelect.do")) {
			
			commend=new MemberSelectDo();
			commend.excuteQueryCommend(request, response);
			fowardURL=(String) request.getAttribute("fowardURL");
			
		}else if(basicURL.equals("/memberUpdate.do")) {
			commend=new MemberUpdateDo();
			commend.excuteQueryCommend(request, response);
		}else if(basicURL.equals("/memberDelete.do")) {
			commend=new MemberDeleteDo();
			commend.excuteQueryCommend(request, response);
		}else if(basicURL.equals("/test1220.do")) {
			fowardURL="/test1220.do";
		}else if(basicURL.equals("/join1221Insert.do")) {
			commend=new join1221InsertDo();
			commend.excuteQueryCommend(request, response);
			fowardURL=(String) request.getAttribute("fowardURL");
		}else if(basicURL.equals("/login1221.do")){
			commend=new LoginOk1221Do();
			commend.excuteQueryCommend(request, response);
			fowardURL=(String) request.getAttribute("fowardURL");
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(fowardURL);
		dispatcher.forward(request, response);//request 설정-> url로 전송
		
		
		
	}
	
	
}
