<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session = "fasle" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃 완료</title>
</head>
<body>
	<h1> 로그아웃 하였습니다. </h1>
	
	<P>  현재 서버 시간: ${serverTime}. </P>
	
	<a href="${cp}/"> 처음으로 </a>
</body>
</html>