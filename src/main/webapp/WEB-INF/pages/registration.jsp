<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Registration</title>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet">
	<style>
        <%@include file="../../resources/css/main.css" %>
        <%@include file="../../resources/css/login.css" %>
        <%@include file="../../resources/css/registration.css" %>
	</style>
</head>
	<body>
		<div class="background">
			<h1 class="header">Online Chat</h1>
			<div class="bodyWrapper">
				<form:form action="registration/process" method="post" modelAttribute="registrationForm" class="form registrationForm">
					<div class="loginHeader">Enter data for registration</div>
					<form:input type="text" path="name" name="name" placeholder="Name" class="field"/>
					<form:input type="text" path="age" name="age" placeholder="Age" class="field"/>
					<form:input type="text" path="login" name="login" placeholder="Login" class="field"/>
					<form:input type="password" path="password" name="password" placeholder="password" class="field"/>
					<button class="btn loginBtn">Enter</button>
				</form:form>
			</div>
		</div>
	</body>
</html>