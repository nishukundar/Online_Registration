<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>table-JSTL</title>
</head>
<body>
<table border=1>

<tr>
<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Delete</th>
<th>Update</th>
</tr>

<c:forEach items="${registrations}" var="registration">

<tr>
  <td>${registration.id }</td>
  <td>${registration.name}</td>
  <td>${registration.email}</td>
  <td>${registration.mobile}</td>
  <td><a href="deleteReg?id=${registration.id}">delete</a></td>
  <td><a href="getRegById?id=${registration.id}">update</a></td>
</tr>

</c:forEach>

</table>
</body>
</html>