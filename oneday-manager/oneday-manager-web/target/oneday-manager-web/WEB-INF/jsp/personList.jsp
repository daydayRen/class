<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>所有人员</title>
</head>
<body>
	<center>
		<table border="1px">
			<tr>
				<td>id:</td>
				<td>name:</td>
				<td>gender:</td>
				<td>address:</td>
				<td>birthday:</td>
			</tr>
		<!-- </table>
		<table border="1px"> -->
			<c:forEach var="p" items="${list }">
				<tr>
					<td><c:out value="${p.id }"></c:out></td>
					<td><c:out value="${p.name }"></c:out></td>
					<td><c:out value="${p.gender }"></c:out></td>
					<td><c:out value="${p.address }"></c:out></td>
					<td><c:out value="${p.birthday }"></c:out></td>
				</tr>
			</c:forEach>
		</table>		
	</center>

</body>
</html>