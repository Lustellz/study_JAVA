<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.PrintWriter"%>
<%@ page import="post.Post"%>
<%@ page import="post.PostDAO"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Write Post</title>
</head>
<body>

	<%
	
		PrintWriter script = response.getWriter();
		String email = null;
		if (session.getAttribute("email") != null) {
			email = (String) session.getAttribute("email");
		}
		if (email==null){

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
	%>

	<nav class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>

			</button>

			<a class="navbar-brand" href="main.jsp">Board Site</a>

		</div>


		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">

			<ul class="nav navbar-nav">
				<li><a href="main.jsp"> Main Page</a></li>
				<li class="active"><a href="post.jsp"> Board Page</a></li>

			</ul>

		</div>
	</nav>

	<div class="container">

		<div class="row">
			<form method="post" action="updateService.jsp?idx=<%=idx %>">
				<table class="table table-striped"
					style="text-align: center; border: 1px solid #ddddd">
					<thread>

					<tr>

						<th colspan="2"
							style="background-color: #eeeee; text-align: center;">Edit
							Post</th>

					</tr>

					</thread>

					<tbody>
						<tr>
							<td><input type="text" class="from-control"
								placeholder="Title" name="title" maxlength="50" value = "<%=post.getTitle()%>"></td>
						</tr>
						<tr>
							<td><textarea class="form-control"
									placeholder="Content" name="content" maxlength="2048"style="height: 350px;"><%=post.getContent()%></textarea>
							</td>
						</tr>
					</tbody>

					
				</table>
				<input type="submit" class="btn btn-primary pull-right"
						value="Update">
			</form>
		</div>

	</div>


	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>