<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true" import="java.util.Date"
	import="java.text.SimpleDateFormat"%>

<%
	Date time = new Date();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String clientTime = formatter.format(session.getLastAccessedTime());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wrong Page</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/wingcss/0.1.8/wing.min.css" />

<script>
	function goBack() {
		window.history.back();
	}
</script>
</head>
<body>

	<div class="container">
		<h1>요청하신 페이지를 찾을 수 없습니다.</h1>

		<h2>유효하지 않은 요청입니다.</h2>

		<h3>The request is not valid.</h3>

		<table>
			<tr>
				<td>Date</td>
				<td>${clientTime}</td>
			</tr>
			<tr>
				<td>Path</td>
				<td>${pageContext.request.contextPath}</td>
			</tr>
			<tr>
				<td>Error</td>
				<td>${pageContext.exception.cause.localizedMessage}</td>
			</tr>
			<tr>
				<td>Status</td>
				<td>${pageContext.exception.cause.message}</td>
			</tr>
			<tr>
				<td>Message</td>
				<td>${pageContext.exception.localizedMessage}</td>
			</tr>
			<tr>
				<td>Exception</td>
				<td>${pageContext.exception.message}</td>
			</tr>
			<tr>
				<td>Trace</td>
				<td>
				<td>${pageContext.exception.stackTrace}</td>
				<pre>${trace}</pre>
				</td>
			</tr>
		</table>

		<input type="submit" value="이전 페이지로 돌아가기" onclick="goBack();" />


	</div>
</body>


</html>