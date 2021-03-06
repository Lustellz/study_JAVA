<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.PrintWriter"%>
<%@ page import="post.PostDAO"%>
<%@ page import="post.Post"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Post Lists</title>

<style type="text/css">
a, a:hover {
	colof: #000000;
	text-decoration: none;
}
</style>
</head>
<body>

	<%
		String email = null;
		if (session.getAttribute("email") != null) {
			email = (String) session.getAttribute("email");
		}
		int pageNum = 1;
		if (request.getParameter("pageNum") != null) {

			pageNum = Integer.parseInt(request.getParameter("pageNum"));
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

			<%
				if (email == null) {
			%>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">More<span class="caret"></span></a>

					<ul class="dropdown-menu">
						<li><a href="login.jsp">Login</a></li>
						<li><a href="join.jsp">Sign Up</a></li>

					</ul>
			</ul>
			<%
				} else {
			%>
			<ul class="nav navbar-nav navbar-right">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">More<span class="caret"></span></a>

					<ul class="dropdown-menu">
						<li class="active"><a href="mypage.jsp">My Page</a></li>
						<li><a href="write.jsp">Write</a></li>
						<li><a href="logoutService.jsp">Log Out</a></li>
					</ul>
			</ul>

			<%
				}
			%>
		</div>
	</nav>

	<div class="container">

		<div class="row">

			<table class="table table-striped"
				style="text-align: center; border: 1px solid #ddddd">
				<thead>

					<tr>

						<th style="background-color: #eeeee; text-align: center;">번호</th>

						<th style="background-color: #eeeee; text-align: center;">제목</th>

						<th style="background-color: #eeeee; text-align: center;">작성자</th>

						<th style="background-color: #eeeee; text-align: center;">작성
							일</th>

						<th style="background-color: #eeeee; text-align: center;">조회
							수</th>

					</tr>
					<tr>
					</tr>
				</thead>

				<tbody>

					<%
						PostDAO postDAO = new PostDAO();
						ArrayList<Post> post_list = postDAO.getList(pageNum);
						for (int i = 0; i < post_list.size(); i++) {
					%>

					<tr>

						<td><%=post_list.get(i).getIdx()%></td>
						<td><a href="post.jsp?idx=<%=post_list.get(i).getIdx()%>"><%=post_list.get(i).getTitle()%></a></td>
						<td><%=post_list.get(i).getAuthor_name()%></td>
						<td><%=post_list.get(i).getCreated_at()%></td>
						<td><%=post_list.get(i).getHitcnt()%></td>

					</tr>

					<%
						}
					%>


				</tbody>
			</table>

			<%
				if (pageNum != 1) {
			%>
			<a href="board.jsp?pageNum=<%=pageNum - 1%>"
				class="btn btn-success btn-arrow-left">이전</a>
			<%
				}
				if (postDAO.nextPage(pageNum)) {
			%>

			<a href="board.jsp?pageNum=<%=pageNum + 1%>"
				class="btn btn-success btn-arrow-right">다음</a>
			<%
				}
			%>

			<a href="write.jsp" class="btn btn-primary pull-right">Write Post</a>

		</div>

	</div>


	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>