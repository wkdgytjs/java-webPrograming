<%@page import="org.project.dto.MemberDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	ArrayList<MemberDto> members=(ArrayList<MemberDto>) request.getAttribute("members");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
	<h1>MemberList.jsp</h1>
	<%
		for(MemberDto member:members){
			out.print("아이디: "+member.getUserId()+",");
			out.print("비밀번호: "+member.getUserPw()+",");
			out.print("이메일: "+member.getEmail()+"<br>");
		}
	
	%>

</body>
</html>