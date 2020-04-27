<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴</title>
<link rel="stylesheet" type="text/css" href="${cp}/resources/css/normal.css" />
</head>
<body>

<h1>탈퇴 하시겠습니까?</h1>
	
	<form:form action="${cp}/member/remove" method="post" commandName="member">
		<input type="hidden" name="memId" value="${member.memId}">
		<table>
			<tr>
				<td>ID</td>
				<td>${member.memId}</td>
			</tr>
			<tr>
				<td>PW</td>
				<td><form:password path="memPw" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Remove" ></td>
			</tr>
		</table>
	</form:form>
	
	<a href="${cp}/">처음으로</a>

</body>
</html>