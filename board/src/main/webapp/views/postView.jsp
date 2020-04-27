<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv = "Content-Type" content="text/html; charset=UTF-8">
<title>${post.title }</title>
</head>
<body>

   <h3>글 내용</h3>
    <div style="padding : 30px;">
      <div class="form-group">
        <label>제목</label>
        <span>${post.title}</span>
      </div>
      <div class="form-group">
        <label>작성자</label>
        <span>${post.author}</span>
      </div>
      <div class="form-group">
        <label>작성 날짜</label>
        <span><fmt:formatDate value="${post.createdAt}" pattern="yyyy/ MM/ dd HH:mm" /></span>
      </div>
      <div class="form-group">
        <label>조회 수</label>
        <span>${post.hit}</span>
      </div>
      <div class="form-group">
        <label>내용</label>
        <p>${post.content}</p>
      </div>
      <div class="form-group">
          <input type="button" value="수정" onclick='location.href="/post/update/${post.idx}"'>
          <form:form action="/post/delete/${post.idx}" method="POST">
              <input type="hidden" name="_method" value="DELETE"/>
              <input type="submit" value="삭제">
          </form:form>
      </div>
    </div>


출처: https://private.tistory.com/38?category=655784 [공부해서 남 주자]

</body>
</html>