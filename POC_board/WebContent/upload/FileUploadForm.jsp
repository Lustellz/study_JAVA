<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>UploadingForm</title>
</head>
<body>

<h3>파일 업로드 양식</h3>

<center>
<form action="FileUpload.jsp" method="post" enctype="Multipart/form-data">
<table border="1" cellpadding="0" cellspacing="0">
<tr>
<td>writer</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>1st file</td>
<td><input type="file" name="filename1"></td>
</tr>
<tr>
<td>2nd file</td>
<td><input type="file" name="filename2"></td>
</tr>
<tr>
<td colspan="2" align="center"><input type="submit" value="upload"></td>
</tr>
</table>
</form>
</center>

</body>
</html>