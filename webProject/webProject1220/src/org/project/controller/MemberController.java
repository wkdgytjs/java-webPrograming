package org.project.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.project.commend.MemberDeleteDo;
import org.project.commend.MemberInsertDo;
import org.project.commend.MemberSelectDo;
import org.project.commend.MemberUpdateDo;
import org.project.commend.SQLCommend;


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
			fowardURL=(String) request.getAttribute("fowardURL");
			
		}else if(basicURL.equals("/memberDelete.do")) {
			
			commend=new MemberDeleteDo();
			fowardURL=(String) request.getAttribute("fowardURL");
			commend.excuteQueryCommend(request, response);
			
		}else if(basicURL.equals("/test1220.do")) {
			fowardURL="/test1220.do";
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(fowardURL);
		dispatcher.forward(request, response);//request 설정-> url로 전송
		
		
		
	}
	
	
}
