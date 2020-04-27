<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset= UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<title>Post List</title>
</head>
<body>
<h3>게시글 목록</h3>

<button class="btn btn-primary" style="float:right;" onclick="location.href='/list/post'"> 새 글 쓰기</button>
<table class="table">
<tr>
<th>#</th>
<th>제목</th>
<th>작성자</th>
<th>생성일</th>
<th>조회 수</th>
</tr>
<c:forEach var="post" items="${list }">
<tr>
<td>${post.idx }</td>
<td><a href="/post/${post.idx}">${post.title }</a></td>
<td>${post.author }</td>
<td><fmt:formatDate value="${post.created_date }" pattern="MM/ dd"/></td>
<td>${post.hit }</td>
</tr>
</c:forEach>
</table>

</body>
</html>