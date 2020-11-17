<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
				<div class="formArc loginForm">
                    <form action="login/process" method="post" modelAttribute="loginForm" class="formArc loginForm">
                        <div class="loginHeader">Введите данные для входа</div>
                        <input type="text" autocomplete="off" name="login"  placeholder="Логин" class="field"/>
                        <input type="password" autocomplete="off" name="password"  placeholder="Пароль" class="field"/>
                        <button class="btn loginBtn">Войти</button>
                        <div class="errorMessage">
                            <span>${errorMessage}</span>
                        </div>
                     </form>
				    <form action="registration">
               		    <button class="subBtn">Первый раз здесь?</button>
                    </form>
				</div>
			</div>
		</div>
	</body>
</html>