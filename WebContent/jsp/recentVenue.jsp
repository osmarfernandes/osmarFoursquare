<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>Login Page</title>
</head>
<body>

	<div style="width: 200px;border: 3px solid green;padding: 10px;;">Four Square Venues</div>
	<div class="w3-container w3-green" style="height:350px;width:1000px;">
	  <h1>My WhishList</h1> 
	  <p>Resize this responsive page!</p> 
	</div>
	<div><br/></div>
	<div class="w3-container w3-blue" style="height:350px;width:1000px;">
	  <h1>Friend's Venues Check-in</h1> 
	  <p>Resize this responsive page!</p> 
	</div>
	
	<c:if test="${not empty lists}">

		<ul>
			<c:forEach var="listValue" items="${lists}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>

	</c:if>
	
</body>
</html>