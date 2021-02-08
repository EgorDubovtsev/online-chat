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
			<div class="formArc registrationForm">
				<form:form action="registration/process" method="post" modelAttribute="registrationForm" class="formArc registrationForm">
					<div class="loginHeader">Введите данные для регистрации</div>
					<form:input type="text" path="name" autocomplete="off" name="name" placeholder="Имя" class="field"/>
					<form:input type="text" path="age" autocomplete="off" name="age" placeholder="Возраст" class="field"/>
					<form:input type="text" path="login" autocomplete="off" name="login" placeholder="Логин" class="field"/>
					<form:input type="password" path="password"  name="password" placeholder="Пароль" class="field"/>
					<button class="btn loginBtn">Зарегистрироваться</button>
					<div class="errorMessage">
					    <span>${errorMessage}</span>
					</div>
				</form:form>
				<form action="login">
                    <button class="subBtn">Уже есть аккаунт?</button>
                </form>
				</div>
			</div>
		</div>
	</body>
</html>