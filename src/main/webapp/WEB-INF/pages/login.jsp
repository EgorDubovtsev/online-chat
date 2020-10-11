<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Login</title>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet">
	<style>
           <%@include file='../../resources/css/main.css' %>
           <%@include file='../../resources/css/login.css' %>
        </style>
</head>
	<body>
		<div class="background">
			<h1 class="header">Online Chat</h1>
			<div class="bodyWrapper">
				<form action="login/process" method="post" class="form loginForm">
					<div class="loginHeader">Enter data for login</div>
					<input type="text" name="login" placeholder="Login" class="field">
					<input type="password" name="password" placeholder="Password" class="field">
					<button class="btn loginBtn">Enter</button>
				</form>
			</div>
		</div>
	</body>
</html>