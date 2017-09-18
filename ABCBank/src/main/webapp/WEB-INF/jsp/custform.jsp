<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Form</title>
</head>
<body>

	<form action="savecust" method="post">
		Email : <input type="text" name="email"> <br>
		Name : <input type="text" name="name"> <br> 
		Phone : <input type="text" name="phone"> <br>
		Address : <input type="text" name="address"> <!-- H.No : <input type="text" name="houseno">    Street : <input type="text" name="street">   Locality : <input type="text" name="locality">  <br>
		District : <input type="text" name="district">   State : <input type="text" name="state">   Country : <input type="text" name="country"> -->
		Service Type : <input	type="text" name="servicetype"> <br> <input
		type="submit" value="Save">
	</form>
</body>
</html>