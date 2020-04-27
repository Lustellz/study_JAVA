<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %><%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ page language="java" session="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import = "java.util.Date"
    import = "java.text.SimpleDateFormat"
    import="org.springframework.security.core.context.SecurityContextHolder"
    import="org.springframework.security.core.Authentication" 
   
    %>
    
    <% 
    
    
	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	Object principal = auth.getPrincipal();
	String ID = "";
	if(principal != "anonymousUser") {
		
		ID = auth.getName();
		System.out.println("ID는??"+ID);
	}
  
	HttpSession session = request.getSession();
	
	if (request.getAuthType() != null){
		System.out.println("뭔놈의 세션을 어디서 가져오는겨." + session);
		System.out.println("이거 나오냐, result임. "+session.getAttribute("result"));
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String clientTime = dateformat.format(session.getLastAccessedTime());
	}
    

    %>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Checking Page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<link href="https://fonts.googleapis.com/css?family=Roboto+Condensed" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/wingcss/0.1.8/wing.min.css"/>
	<link rel="stylesheet" type="text/css" href="/resources/css/theme2.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	<script type="text/javascript" charset="UTF-8">
	$(document).ready(function(){
		  
	    
	    
		var login_status = '${result}';
		var access = $('${access}');
		console.log('이거 보이냐.'+login_status);
		if(login_status == 'valid'){
			alert('${greet}');
		}else if(access=='wrong access'){
			alert('잘못된 접근입니다.');
		}else if(access=='wrong date'){
			alert('유효하지 않은 날짜입니다.');
		}else if(access=='success'){
			alert('${time} 출석 완료!');
		}else if(access=='double'){
			alert('${time} 출석이 이미 완료되었습니다.');
		}
	})
	</script>
</head>
<body>


<div class="container">
<h1>
	출석 체크 이벤트

</h1>
            
<div id="calendar"></div>
<p>  현재 후후 서버 시간: ${serverTime} </p>
<sec:authorize access= "isAuthenticated()">

<p>  현재 클라이언트 시간: <script>
today = new Date();
document.write(today);
</script>. </p>

</sec:authorize>

</div>
	

	<sec:authorize access="isAnonymous()">
	
	//alert & redirect
	
		<a href = '<c:url value="/loginForm"/>'><input type="submit" value="로그인"></a>
	</sec:authorize>

	<sec:authorize access="isAuthenticated()">
	
<table>

<tr align="center">
<td>${AttendedLs} </td>
<td>${member} 객체로 출력되는 중...</td>
</tr>
	<form:form action='/doAttend' mothod="POST">
	<input type="hidden"  name="getDay" id="getDay" value=""/>
	<input type="submit" value="출석"/>
	</form:form>

</table>
	member.ID: <%=auth.getName()%>
	//check date & return date
	<form:form action='/logout' method = "POST">
	<input type="submit" value = "로그아웃">
	</form:form>
	
	</sec:authorize>

<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.18.0/moment.min.js"></script>
<script type="text/javascript" charset="UTF-8" src="resources/js/calendar.min.js"></script>
<script type="text/javascript" charset="UTF-8" src="resources/js/main.js"></script>

<script>
document.getElementById('getDay').value = (String) today;
</script>
</body>

</html>
