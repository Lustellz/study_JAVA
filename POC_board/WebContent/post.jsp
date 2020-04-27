<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.PrintWriter"%>
<%@ page import="post.Post"%>
<%@ page import="post.PostDAO"%>
<%@ page import="java.sql.*"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>View Post</title>
</head>
<body>

	<%
		Class.forName("java.sql.DriverManager");

		String dbURL = "jdbc:mysql://localhost:3306/test?autoReconnect=true&characterEncoding=utf8&useUnicode=true&zeroDateTimeBehavior=convertToNull";
		String dbID = "root";
		String dbPassword = "admin";

		String email = null;
		if (session.getAttribute("email") != null) {
			email = (String) session.getAttribute("email");
		}
		int idx = 0;
		if (request.getParameter("idx") != null) {
			idx = Integer.parseInt(request.getParameter("idx"));
		}
		if (idx == 0) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('유효하지 않은 글입니다.')");
			script.println("location.href='board.jsp'");
			script.println("</script>");
		}

		try {
			Connection conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			Statement stmt = conn.createStatement();
			String sql = "SELECT hitcnt FROM post WHERE idx=" + idx;
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				int hit = rs.getInt(1);
				hit++;
				sql = "UPDATE post SET hitcnt=" + hit + " where idx=" + idx;
				stmt.executeUpdate(sql);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		Post post = new PostDAO().getPost(idx);
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

						<th colspan="3"
							style="background-color: #eeeee; text-align: center;">View
							Post</th>

					</tr>

				</thead>

				<tbody>
					<tr>
						<td style="width: 20%;">Title</td>
						<td colspan="2"><%=post.getTitle()%></td>
					</tr>
					<tr>
						<td>Author</td>
						<td colspan="2"><%=post.getAuthor_name()%></td>
					</tr>
					<tr>
						<td>Created At</td>
						<td colspan="2"><%=post.getCreated_at()%></td>
					</tr>
					<%
						if (post.getUpdated_at() != null) {
					%>
					<tr>
						<td>Updated_at</td>
						<td colspan="2"><%=post.getUpdated_at()%></td>
					</tr>

					<%
						}
					%>
					<tr>
						<td>Hit</td>
						<td colspan="2"><%=post.getHitcnt()%></td>
					</tr>

					<tr>
						<td>Content</td>
						<td colspan="2" style="min-height: 200px; text-align: left;"><%=post.getContent().replaceAll(" ", "&nbsp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;")
					.replaceAll("\n", "<br>")%></td>
					</tr>

				</tbody>


			</table>

			<a href="board.jsp" class="btn btn-primary">Back to List</a>

			<%
				if (email != null && email.equals(post.getAuthor_name())) {
			%>
			<a href="update.jsp?idx=<%=idx%>" class="btn btn-primary">Update</a>
			<a onclick="return confirm('정말로 삭제하시겠습니까?')"
				href="deleteService.jsp?idx=<%=idx%>" class="btn btn-danger">Delete</a>
			<%
				}
			%>

		</div>

	</div>


	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>