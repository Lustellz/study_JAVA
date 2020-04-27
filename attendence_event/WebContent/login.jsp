<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
  
    session = "true"
    isErrorPage="false"
    errorPage=""
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
<script type="text/javascript">
function member_validate() {
	
	  var userId = document.getElementById("userId").value;
	  var userPw = document.getElementById("userPw").value;
	  
	  console.log(userPw);
	    // 아이디 입력 유무 체크
	    if(userId.legnth == 0 || !(userId.length >= 3 && userId.length <= 12)) {
	        
	    	$(document).alert("아이디를 입력하시오");
	        console.log("어디잇니");
	        document.getElementById("uerId").focus();
	        document.getElementById('userId').select();
	        return false; // 아이디 입력이 안되어 있다면 submit 이벤트를 중지
	    }
	    
	    // 암호 입력 유무 체크
	    
	    console.log(userId);
	    if(userPw.length==0){
	        $(document).alert("암호를 입력하세요.");
	        console.log("여기 왔냐");
	        documnet.getElementById("userPw").focus();
	        documnet.getElementById("userPw").select();
	        return false;
	    }
}
</script>
<title>Login Page</title>
</head>
<body>
<form id = "fmField" name="fmField" action="" method = "post" encType="UTF-8" onsubmit = "return member_validate();" >
<div class = "form">
<table class="ftb">
<tr><td>
ID</td>
<td><input type="text" name = "userId" id="userId"/></td>
</tr>

<tr>
<td>
Password
</td>
<td><input type="password" name = "user_pw" id="userPw"/> </td>
</tr>
<tr>
<td colspan = "2">

<input type="submit" action="/Account/login" value="login"/>
<input type="reset" value = " 재입력">

</td>
</tr>
</table>
<input type="hidden" name= "user_address" value="location">
</div>
</form>
</body>
</html>