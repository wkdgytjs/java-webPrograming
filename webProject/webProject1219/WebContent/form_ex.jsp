<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <form action="joinOk.do" method="POST" id="joinForm">
        <label for="userId">아이디</label>
        <input type="text" name="userId" id="userId"> <br>
        <label for="usrePw">비밀번호</label>
        <input type="password" name="userPw" id="userPw"> <br>
        <label for="userName">이름</label>
        <input type="text" name="userName" id="userName"> <br>

        <label for="gender">성별</label>
        <input type="radio" name="gender" class="gender" value="남자"> 남
        <input type="radio" name="gender" class="gender" value="여자"> 여 <br>
        
        <label for="hobbys">취미</label>
        <input type="checkbox" name="hobbys" class="hobbys" value="등산"> 등산
        <input type="checkbox" name="hobbys" class="hobbys" value="영화감상"> 영화감상
        <input type="checkbox" name="hobbys" class="hobbys" value="게임"> 게임 <br>

        <label for="phone">전화번호</label>
        <select name="phone" id="phone" class="phone">
            <option value="" selected>::통신사::</option>
            <option value="SK">SK</option>
            <option value="KT">KT</option>
            <option value="LG U+">LG U+</option>
        </select>
        <input type="text" name="phone" id="phone2" class="phone" size="3" maxlength="3">
        <input type="text" name="phone" id="phone3" class="phone" size="4" maxlength="4">
        <input type="text" name="phone" id="phone4" class="phone" size="4" maxlength="4">
        <br>

        <label for="memo">자기소개</label><br>
        <textarea name="memo" id="memo" cols="30" rows="10"></textarea> <br>

        <input type="reset" value="초기화">
        <input type="button" value="이벤트구현" id="btn">
        <!-- <input type="submit" value="회원가입 실행"> -->
        <input type="submit" value="제출">
    </form>

</body>
</html>