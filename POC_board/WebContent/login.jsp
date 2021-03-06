<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" initial-scale="1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Login Page</title>
</head>
<body>
	<nav class="navbar navbar-default">
	<div class="navbar-header">
	<button type="button" class="navbar-toggle collapsed"
	data-toggle="collapse" 
	data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
	<span class="icon-bar"></span>
	<span class="icon-bar"></span>
	<span class="icon-bar"></span>
	
	</button>
	
	<a class="navbar-brand" href="main.jsp">Board Site</a>	
	
	</div>
	
	
	<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	
	<ul class="nav navbar-nav">
	<li><a href="main.jsp"> Main Page</a></li>
	<li><a href="post.jsp"> Board Page</a></li>
	<li><a href="mypage.jsp"> My Page</a></li>
	</ul>
	
	<ul class="nav navbar-nav navbar-right">
	<li class="dropdown">
	
	<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" 
	aria-expanded="false">More<span class="caret"></span></a>
	
	<ul class="dropdown-menu">
	<li class="active"><a href="login.jsp">Login</a></li>
	<li><a href="join.jsp">Sign Up</a></li>
	
	</ul>
	
	</ul>
	
	</div>
	</nav>
	
	<div class="container">
	
	<div class="col-lg-4"></div>
	<div class="col-lg-4">
	
	<div class="jumbotron" style="padding-top: 20px;">
	
	<form method="post" action="loginService.jsp">
	<h3 style="text-align: center;">Login Page</h3>
	<div class="form-group">
	<input type="text" class="form-control" placeholder="E-mail" name="email" maxlength="50">
	</div>
		<div class="form-group">
	<input type="password" class="form-control" placeholder="Password" name="password" maxlength="20">
	</div>
	<input type="submit" class="btn btn-primary form-control" value="Login">
	
	</form>
	
	</div>
	</div>
	
	
	</div>
	
	
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="js/bootstrap.js"></script>
</body>
</html>