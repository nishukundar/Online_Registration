<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>


<c:set  var="name" scope="session" value="${registrations.name}"></c:set> 
<c:set var="email" value="${registrations.email}" ></c:set>
<c:set var="mobile" value="${registrations.mobile}" ></c:set>

<form action="updateData" method="post">
<h2>Update here!</h2>
         <input type="hidden" name="id" value="${registrations.id}"/><br><br>
Name   : <input type="text" name="name" value="${name}" /><br><br>
Email  : <input type="text" name="email" value="${email}" /><br><br>
Mobile : <input type="text" name="mobile" value="${mobile}" /><br><br>
         <input type="submit" value="update" />


</form>
${msg}
</body>
</html>