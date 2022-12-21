//loginOk.jsp

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login Succeeds</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("admin") && pw.equals("1111")){
			Cookie cookie=new Cookie("cookieId", id);
			cookie.setMaxAge(60);
			response.addCookie(cookie);
			response.sendRedirect("cookieMain.jsp"); //바로 서블릿이나 jsp로 전달
		} else {
			response.sendRedirect("login.html");
		}
	%>
</body>
