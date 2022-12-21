//cookieMain.jsp

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Cookie Main</title>
</head>
<body>
	<%
		Cookie[] cookies=request.getCookies();
		for(int i=0; i<cookies.length;i++){
			String cookieId=cookies[i].getValue();
			
			if(cookieId.equals("admin")) {
				out.print(cookieId + "님 안녕하세요"+"<br />");
			}
		}
	%>
	<a href="logout.jsp">로그아웃</a>
</body>
</html>