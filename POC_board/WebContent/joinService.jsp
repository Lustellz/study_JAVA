<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="user.UserDAO" %>
    <%@ page import="java.io.PrintWriter" %>
    <%request.setCharacterEncoding("UTF-8"); %>
    
<jsp:useBean id= "user" class="user.User" scope="page"/>
<jsp:setProperty name="user" property="email"/>
<jsp:setProperty name="user" property="password"/>
<jsp:setProperty name="user" property="author_name"/>
<jsp:setProperty name="user" property="details"/>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Join Process</title>
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

if(user.getEmail() == null){
	script.println("<script>");
	script.println("alert('이메일을 입력해 주세요.')");
	script.println("history.back()");
	script.println("</script>");
}else
	
	if(user.getPassword() == null){
		script.println("<script>");
		script.println("alert('비밀번호를 입력해 주세요.')");
		script.println("history.back()");
		script.println("</script>");
	}
	else{


UserDAO userDAO = new UserDAO();
int result = userDAO.join(user);
if(result==-1)
{

	script.println("<script>");
	script.println("alert('이미 존재하는 아이디입니다.')");
	script.println("history.back()");
	script.println("</script>");

}

else{
	session.setAttribute("email",user.getEmail());
	script.println("<script>");
	script.println("location.href='main.jsp'");
	script.println("</script>");
	}
}



%>

</body>
</html>