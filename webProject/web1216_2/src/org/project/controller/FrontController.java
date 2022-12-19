package org.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FrontController extends HttpServlet{
	
	//get방식으로 요청 -> 브라우저 주소에 입력하는 경우
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String path= request.getContextPath();//프로젝트 기본 경로(path)
		String uri = request.getRequestURI();//프로젝트 +파일(요청) 경로
		String bUri = uri.substring(path.length());//문자열에서 시작번지부터 ~ 나머지 문자열을 get
		
		
		System.out.println("path: "+path);
		System.out.println("uri: "+uri);
		System.out.println("bUri: "+bUri);

		System.out.println("===============================================");
		String host = request.getRemoteHost();//요청 host
		System.out.println("host: "+host);
		StringBuffer URL=request.getRequestURL();//요청 전체경로
		System.out.println("URL: "+URL);
		
		// /insert.do -> 콘솔에 회원가입
		// /select.do -> 콘솔에 회원조회
		// /update.do -> 콘솔에 회원수정
		// /delete.do -> 콘솔에 회원탈퇴
		if(bUri.equals("/insert.do")) {
			System.out.println("회원가입");
		}else if(bUri.equals("/select.do")) {
			System.out.println("회원조회");
		}else if(bUri.equals("/update.do")) {
			System.out.println("회원수정");
		}else if(bUri.equals("/delete.do")) {
			System.out.println("회원탈퇴");
		}else {
			System.out.println("입력오류");
		}
		
		// 서버 -> 클라이언트 응답 -> HTML로 응답 View
		PrintWriter out=response.getWriter();
		out.println("<!doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Servlet -> Response</h1>");
		out.println("path1216: "+path);
		out.println("<br>");
		out.println("uri1216: "+uri);
		out.println("<br>");
		out.println("bUri: "+bUri);
		out.println("<br>");
		out.println("host: "+host);
		out.println("<br>");
		out.println("URL: "+URL);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
