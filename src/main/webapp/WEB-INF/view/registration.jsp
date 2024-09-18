<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<form action="saveReg" method="post">
<h2>Register here! </h2>
Name   : <input type="text" name="name" /><br><br>
Email  : <input type="text" name="email" /><br><br>
Mobile : <input type="text" name="mobile" /><br><br>
         <input type="submit" value="save" />
</form>
${msg}
</body>
</html>