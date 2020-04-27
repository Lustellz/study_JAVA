<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="post.PostDAO"%>
<%@ page import="post.Post"%>
<%@ page import="java.io.File"%>
<%@ page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.io.PrintWriter"%>
<%
	String uploadPath = request.getRealPath("/upload");
	out.print("realPath: " + uploadPath);
	int size = 5 * 1024 * 1024;
	String title = "";
	String content = "";

	String filename1 = "";
	String originalName1 = "";

	String filename2 = "";
	String originalName2 = "";

	MultipartRequest multi = null;

	try {
		multi = new MultipartRequest(request, uploadPath, size, "utf-8", new DefaultFileRenamePolicy());

		title = multi.getParameter("title");
		content = multi.getParameter("content");

		Enumeration files = multi.getFileNames();

		String file1 = (String) files.nextElement();
		filename1 = multi.getFilesystemName(file1);
		originalName1 = multi.getOriginalFileName(file1);

		String file2 = (String) files.nextElement();
		filename2 = multi.getFilesystemName(file2);
		originalName2 = multi.getOriginalFileName(file2);

	} catch (Exception e) {
		out.print(e.getMessage());
		System.out.println("error in processing files" + e.getMessage());
	}
%>

<jsp:useBean id="post" class="post.Post" scope="page" />
<jsp:setProperty name="post" property="title" />
<jsp:setProperty name="post" property="content" />
<jsp:setProperty name="post" property="author_name" />

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Posting Process</title>
</head>
<body>

	<%
		PrintWriter script = response.getWriter();

		String email = null;
		if (session.getAttribute("email") != null) {
			email = (String) session.getAttribute("email");
		}

		if (email == null) {
			script.println("<script>");
			script.println("alert('로그인 하세요.')");
			script.println("location.href='login.jsp'");
			script.println("</script>");
		} else {

			if (post.getTitle() == null) {
				script.println("<script>");
				script.println("alert('제목을 입력해 주세요.')");
				script.println("history.back()");
				script.println("</script>");
			} else

			if (post.getContent() == null) {
				script.println("<script>");
				script.println("alert('내용을 입력해 주세요.')");
				script.println("history.back()");
				script.println("</script>");
			} else {

				post.PostDAO postDAO = new PostDAO();

				if (post.getAuthor_name() != null) {
					int result = postDAO.write(post.getAuthor_name(), post.getTitle(), post.getContent());

					if (result == -1) {

						script.println("<script>");
						script.println("alert('글쓰기에 실패했습니다.')");
						script.println("history.back()");
						script.println("</script>");

					}

					else {
						script.println("<script>");
						script.println("location.href='board.jsp'");
						script.println("</script>");
					}
				} else {
					int result = postDAO.write(email, post.getTitle(), post.getContent());
					if (result == -1) {

						script.println("<script>");
						script.println("alert('글쓰기에 실패했습니다.')");
						script.println("history.back()");
						script.println("</script>");

					}

					else {
						script.println("<script>");
						script.println("location.href='board.jsp'");
						script.println("</script>");
					}
				}

			}

		}
	%>

	<form action="fileCheck.jsp" method="post" name="fileCheck">

		<input type="hidden" value="<%=title%>" name="title"> <input
			type="hidden" value="<%=content%>" name="content"> <input
			type="hidden" value="<%=filename1%>" name="filename1"> <input
			type="hidden" value="<%=filename2%>" name="filename2"> <input
			type="hidden" value="<%=originalName1%>" name="originalName1">
		<input type="hidden" value="<%=originalName2%>" name="originalName2">
		<a href="#" onclick="javascript:fileCheck.submit()">check uploaded</a>


	</form>

</body>
</html>