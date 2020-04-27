<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	session="false"%>
<%
	HttpSession session = request.getSession(false);
	if (session != null) {
		session.setAttribute("access", "success");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"
	name="viewport" content="width=device-width, initial-scale=1">
<title>로그인 페이지</title>
<jsp:include page="/WEB-INF/include/header.jsp"></jsp:include>
<script type="text/javascript">
	$(document).ready(function() {
		$("#submit").click(function() {
			if ($("#ID").val() == "") {
				alert("로그인 아이디를 입력해 주세요.");
				$("#ID").focus();
				return false;
			} else if ($("#password").val() == "") {
				alert("로그인 비밀번호를 입력해 주세요.");
				$("#password").focus();
				return false;
			} else if ($("#ID").val() != "" && $("#password").val != "") {
				$("#login").attr("action", "<c:url value='/login'/>");
				$("#login").submit();
			}

		}

		);
	});
</script>


</head>
<body>


	<div class="container">
		<h1>회원 로그인</h1>
		<form id="login" action='<c:url value="/login"/>' method="POST">

			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" id="ID" name="ID" value="${ID}" /></td>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" id="password" name="password" /></td>

				</tr>
				<tr>
					<td><input type="submit" id="submit" value="로그인"></td>


					<c:if test="{not empty ERRORMSG}">
			${errormsg}
			</c:if>

				</tr>
			</table>
		</form>
		<table>
			<tr>
				<td><a href='<c:url value="/"/>' role="button"><input
						type="submit" value="메인으로"></a></td>
			</tr>
		</table>
	</div>
	<script>
		var login_status = '${result}';

		if (login_status == 'wrong password') {
			alert('비밀번호가 일치하지 않습니다.');
		} else if (request.exception) {
			alert('등록되지 않은 회원입니다.');
		} else {
			alert(session.getAttribute("greet"));
		}
	</script>
</body>
</html>