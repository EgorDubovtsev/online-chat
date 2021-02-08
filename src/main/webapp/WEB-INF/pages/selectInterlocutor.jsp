<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Online Chat</title>
	<c:set var="staticRoot" value="${pageContext.request.contextPath}/resources"/>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
	<script src="../../resources/js/selectInterlocutorScripts.js"></script>
		<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet">
			<style>
	        	<%@include file="../../resources/css/main.css"%>
	        	<%@include file="../../resources/css/select.css"%>
                .userPhoto{
                    height: 50px;
                    width: 50px;
                    background-image:url(${staticRoot}/img/user.png);
                }
        	</style>
</head>
<body>
	<div class="background">
			<div class="headerWrapper">
				<h1 class="header">Online Chat</h1>
				<div class="navWrapper">
					<form action="/logout" method="post">
                    	<button class="btn navBtn">Выйти</button>
                	</form>
				</div>
			</div>
		<div class="bodyWrapper">
			<div class="formArc searchFormArc">
				<div class="searchForm">
					<input type="text" id="searchLine" name="opponentName" class="opponentName" placeholder="Имя или логин собеседника..." />
					<button class="btn searchBtn" id="search">></button>
				</div>
				<div class="searchResults"></div>
			</div>
		</div>
</div>
</body>
</html>