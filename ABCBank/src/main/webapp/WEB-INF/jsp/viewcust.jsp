<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Customer</title>
</head>
<body>
	<table border="2" cellpadding="2" width="70%">

		<c:forEach var="cust" items="${list}">
			<tr>
				<td>${cust.customerid}</td>
				<td>${cust.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>