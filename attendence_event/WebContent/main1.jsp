<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import="java.util.Calendar"%>
<% Calendar now = Calendar.getInstance();%>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Today's Attendence</title>
</head>
<body>
<div>
<button> <%=now.get(Calendar.YEAR) %>년 <%=now.get(Calendar.MONTH)+1 %>월 <%=now.get(Calendar.DATE) %>일 </button>

<button>출석 이력</button>
</div>
</body>
</html>