package org.project.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardController extends HttpServlet{
	

	@Override
	public void init() throws ServletException {
		System.out.println("Init");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("GET");
		
		
		String path=request.getContextPath();
		String uri=request.getRequestURI();
		String bUri=uri.substring(path.length());
		
		if(bUri.equals("/bWrite.board")) {
			System.out.println("게시글 작성");
		}else if(bUri.equals("/bUpdate.board")) {
			System.out.println("게시글 수정");
		}else if(bUri.equals("/bDelete.board")) {
			System.out.println("게시글 삭제");
		}else if(bUri.equals("/bSelect.board")) {
			System.out.println("게시글 조회");
		}else {
			System.out.println("입력오류");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("POST");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy");
	}
	
	
	
		
		
		
		
		
	}



