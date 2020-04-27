<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    request.setCharacterEncoding("utf-8");
    
    String title=request.getParameter("title");
    String content=request.getParameter("content");
    
    String filename1=request.getParameter("filename1");
    String filename2=request.getParameter("filename2");
    
    
    String originalName1=request.getParameter("originalName1");
    String originalName2=request.getParameter("originalName2");
    
    
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>File check/title>
</head>
<body>

<h3>Check uploaded</h3>
writer: <%=title %><br>
title: <%=content %><br>

file1: <a href="fileDown.jsp?file_name=<%=filename1 %>"><%=originalName1 %></a><br>
file2: <a href="fileDown.jsp?file_name=<%=filename2 %>"><%=originalName2 %></a><br>


</body>
</html>