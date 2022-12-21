<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sessionget.jsp</title>
</head>
<body>
	<%
		Object obj1=session.getAttribute("admin1");
		String sessionId1=(String)obj1;//문자형으로 변환
		out.println(sessionId1+"<br/>");

		Object obj2=session.getAttribute("adminNUM");
		Integer sessionId2=(Integer)obj2;//숫자형으로 변환
		out.println(sessionId2+"<br/>");
		
		Object obj3=session.getAttribute("adminPW");
		Integer sessionId3=(Integer)obj3;//숫자형의 변환
		out.println(sessionId3+"<br/>");
		
		out.println("*******************<br/>");

		
		Enumeration enumeration=session.getAttributeNames();//session 모든 data
		
		while(enumeration.hasMoreElements()){//session의 모든 정보를 출력
			
			String sName=enumeration.nextElement().toString();
			String sValue=session.getAttribute(sName).toString();
			out.println("세션이름:"+sName+" ,세션값:"+sValue+"<br/>");
		}
		
		out.println("*******************<br/>");
		
		if(session!=null){
			session.invalidate();//모든 session종료		
		}
		
		if(request.isRequestedSessionIdValid()){
			out.println("session valid");
		}else{
			out.println("session invalid");
		}
		
	%>

</body>
</html>