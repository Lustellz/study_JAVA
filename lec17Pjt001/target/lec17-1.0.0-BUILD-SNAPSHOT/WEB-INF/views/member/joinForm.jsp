<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>회원 가입</title>
</head>
<body>

	<h1>회원 가입</h1>
	
	<form:form action="${cp}/member/join" method="post" commandName="member">
		<table>
			<tr>
				<td>ID</td>
				<td><form:input path="memId" /></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><form:password path="memPw" /></td>
			</tr>
			<tr>
				<td>MAIL</td>
				<td><form:input path="memMail" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Join" >
					<input type="reset" value="Cancel" >
				</td>
			</tr>
		</table>
	</form:form>
	
	<a href="${cp}/">처음으로</a>

</body>
</html>