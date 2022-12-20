<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<h1>join.jsp</h1>
<form action="memberInsert.do" method="POST" id="joinForm">

	<label for="userId">아이디</label>
	<input type="text" name="userId" id="userId" size="10"> <br>

	<label for="userPw">비밀번호</label>
	<input type="password" name="userPw" id="userPw"> <br>

	<label for="email">이메일</label>
	<input type="text" name="email" id="email"> <br>
	
	<input type="reset" value="초기화">
	<input type="button" value="이벤트구현" id="btn1">
	<input type="submit" class="joinOk" value="회원가입 실행">
</form>
</body>
</html>