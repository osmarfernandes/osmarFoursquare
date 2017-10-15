<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
.center {
    padding: 70px 0;
    text-align: center;
}
</style>
<title>Login Page</title>
</head>
<body>
	<div class="center" >
		<div class="w3-container w3-blue" style="margin: auto;width: 30%;padding: 10px; height:135px;">
		<h3>Osmar Four Square Login !</h3>
		<div><br/></div>
		<form:form id="loginForm" modelAttribute="login" action="loginAuthFS" method="post">
			<form:button id="login" name="login">Log-in Four Square</form:button>
		</form:form>
		</div>
	</div>
	
</body>
</html>