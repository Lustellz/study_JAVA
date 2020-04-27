<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정 완료</title>
</head>
<body>
<h1> 회원 정보 수정 완료 </h1>

	<h3> 수정 내역 확인 </h3>
	ID : ${memAft.memId} <br />
	PW : ${memAft.memPw} <br />
	Mail : ${memAft.memMail} <br />
	
	<P>  서버 현재 시간:  ${serverTime}. </P>
	
	<a href="/ch12/"> 처음으로 </a>
</body>
</html>