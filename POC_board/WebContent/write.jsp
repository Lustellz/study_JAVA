<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.PrintWriter"%>
<%@ page import="post.Post"%>
<%@ page import="post.PostDAO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Write Post</title>
</head>
<body>

	<%
		String email = null;
		if (session.getAttribute("email") != null) {
			email = (String) session.getAttribute("email");
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


	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

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
			<form method="post" action="postService.jsp"
				enctype="Multipart/form-data">
				<table class="table table-striped"
					style="text-align: center; border: 1px solid #ddddd">
					<thead>

					<tr>

						<th colspan="2"
							style="background-color: #eeeee; text-align: center;">Write
							Post</th>

					</tr>

					</thead>

					<tbody>
						<tr>
							<td><input type="text" class="from-control"
								placeholder="Title" name="title" maxlength="50"></td>
						</tr>
						<tr>
							<td><textarea class="form-control" placeholder="Content"
									name="content" maxlength="2048" style="height: 350px;"></textarea>
							</td>
						</tr>

						<tr>
							<td><input type="file" name="fileName1"></td>
						</tr>
						<tr>
							<td><input type="file" name="fileName2"></td>
						</tr>
					</tbody>


				</table>
				<input type="submit" class="btn btn-primary pull-right"
					value="Upload">
			</form>
		</div>

	</div>


	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>