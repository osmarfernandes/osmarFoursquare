<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Login FourSquare</title>
</head>
<body>
	<h3>Osmar FourSquare Login !</h3>
	
	<form:form id="loginForm" modelAttribute="login" action="login" method="post">
		<form:button id="login" name="Log-in Four Square" value="Log-in Four Square"></form:button>
	</form:form>
	
</body>
</html>