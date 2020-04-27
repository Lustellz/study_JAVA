<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="post.PostDAO" %>
        <%@ page import="post.Post" %>
    <%@ page import="java.io.PrintWriter" %>
    <%
    	request.setCharacterEncoding("UTF-8");
    %>
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
	if(session.getAttribute("email")!=null){
		email = (String) session.getAttribute("email");
	}

	if(email == null){
		script.println("<script>");
		script.println("alert('로그인 하세요.')");
		script.println("location.href='login.jsp'");
		script.println("</script>");
	}
	
	int idx = 0;
	if (request.getParameter("idx") != null) {
		idx = Integer.parseInt(request.getParameter("idx"));
	}
	if (idx == 0) {
		script.println("<script>");
		script.println("alert('유효하지 않은 글입니다.')");
		script.println("location.href='board.jsp'");
		script.println("</script>");
	}
	Post post = new PostDAO().getPost(idx);
	if(!email.equals(post.getAuthor_name())){
		script.println("<script>");
		script.println("alert('권한이 없습니다.')");
		script.println("location.href='board.jsp'");
		script.println("</script>");
	}
	
	else{
		post.PostDAO postDAO = new PostDAO();
			if(post.getAuthor_name()!=null){
				int result = postDAO.delete(idx);
				
				if(result==-1)
				{

					script.println("<script>");
					script.println("alert('글 삭제에 실패했습니다.')");
					script.println("history.back()");
					script.println("</script>");

				}

				else{
					script.println("<script>");
					script.println("location.href='board.jsp'");
					script.println("</script>");
					}
			}else{
				int result = postDAO.delete(idx);
				if(result==-1)
				{

					script.println("<script>");
					script.println("alert('글 삭제에 실패했습니다.')");
					script.println("history.back()");
					script.println("</script>");

				}

				else{
					script.println("<script>");
					script.println("location.href='board.jsp'");
					script.println("</script>");
					}
			}
		
		
	}
	%>

</body>
</html>