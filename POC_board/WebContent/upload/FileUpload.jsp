<%@ page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    String uploadPath = request.getRealPath("/upload");
    out.print("realPath: "+uploadPath);
    int size=5*1024*1024;
    String name = "";
    String subject = "";
    
    String filename1 = "";
    String originalName1 = "";
    
    String filename2 = "";
    String originalName2 = "";
    
	MultipartRequest multi = null;

	try {
		multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());

		name=multi.getParameter("name");
		subject = multi.getParameter("subject");
		
		Enumeration files = multi.getFileNames();
		
		String file1 = (String)files.nextElement();
		filename1 = multi.getFilesystemName(file1);
		originalName1=multi.getOriginalFileName(file1);
		
		String file2 = (String)files.nextElement();
		filename2 = multi.getFilesystemName(file2);
		originalName2=multi.getOriginalFileName(file2);
		
	} catch (Exception e) {
		out.print(e.getMessage());
		System.out.println("error in processing files"+e.getMessage());
	}
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content = "text/html; charset=UTF-8">
<title>FileUpload</title>
</head>
<body>

<form action="fileCheck.jsp" method="post" name="fileCheck">

<input type="hidden" value="<%=name %>" name="name">
<input type="hidden" value="<%=subject %>" name="subject">
<input type="hidden" value="<%=filename1 %>" name="filename1">
<input type="hidden" value="<%=filename2 %>" name="filename2">
<input type="hidden" value="<%=originalName1 %>" name="originalName1">
<input type="hidden" value="<%=originalName2 %>" name="originalName2">


</form>

<a href="#" onclick="javascript:fileCheck.submit()">check uploaded</a>

</body>
</html>