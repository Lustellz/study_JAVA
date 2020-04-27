<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 완료</title>
</head>
<body>

<h1>회원 가입이 완료되었습니다.</h1>
	
	ID : ${member.memId} <br />
	PW : ${member.memPw} <br />
	Mail : ${member.memMail} <br />
	
	<P>  현재 시간: ${serverTime}. </P>
	
	<a href="${cp}/"> 처음으로 </a>

</body>
</html>