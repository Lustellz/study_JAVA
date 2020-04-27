<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 완료</title>
</head>
<body>
<h1> 회원 로그인 </h1>
	
	ID : ${member.memId}<br />
	PW : ${member.memPw}<br />
	
	<P>  현재 서버 시간: ${serverTime}. </P>
	
	<a href="${cp}/"> 처음으로 </a>
</body>
</html>