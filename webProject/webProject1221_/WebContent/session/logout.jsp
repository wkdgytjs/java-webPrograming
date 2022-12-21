<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout.jsp</title>
</head>
<body>
	<%
		//세션이 있으면 while문을실행
		Enumeration enumeration=session.getAttributeNames();
	
		while(enumeration.hasMoreElements()){
			String sName=enumeration.nextElement().toString();//"sessionId"
			String sValue=(String) session.getAttribute(sName);//value -> admin
			if(sValue.equals("admin")){
				//session이름 admin//특정 이름 세션 삭제
				session.removeAttribute(sName);
				//모든 세션 삭제
				//session.invalidate();
			}
		}
	%>
	<a href="sessiontest.jsp">sessionTest</a>
</body>
</html>