<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="user.UserDAO" %>
    <%@ page import="java.io.PrintWriter" %>
    <%request.setCharacterEncoding("UTF-8"); %>
    
<jsp:useBean id= "user" class="user.User" scope="page"/>
<jsp:setProperty name="user" property="email"/>
<jsp:setProperty name="user" property="password"/>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Login Process</title>
</head>
<body>
	
<%
PrintWriter script = response.getWriter();
String email = null;
if(session.getAttribute("email")!=null){
	email = (String) session.getAttribute("email");
}

if(email != null){
	script.println("<script>");
	script.println("alert('이미 로그인 되어 있습니다.')");
	script.println("location.href='main.jsp'");
	script.println("</script>");
}

UserDAO userDAO = new UserDAO();
int result = userDAO.login(user.getEmail(), user.getPassword());

if(result==1)
{
	session.setAttribute("email",user.getEmail());
	script.println("<script>");
	script.println("location.href='main.jsp'");
	script.println("</script>");
}

else if(result==0){
	script.println("<script>");
	script.println("alert('비밀번호가 틀렸습니다.')");
	script.println("history.back()");
	script.println("</script>");
}
else if(result==-1){
	script.println("<script>");
	script.println("alert('존재하지 않는 아이디입니다.')");
	script.println("history.back()");
	script.println("</script>");
}else {
	script.println("<script>");
	script.println("alert('데이터베이스 오류 발생. 에러 코드: ',result)");
	script.println("history.back()");
	script.println("</script>");
}

%>

</body>
</html>