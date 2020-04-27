<%@ page contentType="text/html;charset=UTF-8" language="java" 
pageEncoding= "UTF-8" 
isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html>
<head>
<%@ page import = "java.util.Calendar" %>
<% Calendar now = Calendar.getInstance(); %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Main Checking Page</title>
</head>
<body>

<div><h1>오늘의 출석 체크</h1></div>
<div><%=now.get(Calendar.YEAR) %>년 <%=now.get(Calendar.MONTH)+1 %>월 <%=now.get(Calendar.DATE) %>일 </div>

<h1>Comments</h1>
<c:if test="${bindingResult != null}">
    <ul>
        <c:forEach var="message" items="${bindingResult.allMessages}">
            <li><span style="color: red;">${mvc.encoders.html(message)}</span></li>
        </c:forEach>
    </ul>
</c:if>
<form action="${mvc.basePath}/comments" method="post">
    <input name="comment" placeholder="Comment"><input type="submit" value="Send">
    <input type="hidden" name="${mvc.csrf.name}" value="${mvc.csrf.token}">
</form>
<ul>
    <c:forEach var="comment" items="${comments.comments}">
        <li>${mvc.encoders.html(comment)}</li>
    </c:forEach>
</ul>
</body>
</html>
