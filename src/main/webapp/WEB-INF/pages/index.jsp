<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
	<title>Chat</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    	<script src="../../resources/js/messages.js"></script>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet">
		<style>
            <%@include file="../../resources/css/main.css"%>
            <%@include file="../../resources/css/login.css"%>
    	</style>
</head>
	<body>
		<div class="background">
			<h1 class="header">Online Chat</h1>
                <form action="/logout" method="post">
                    <button>Log out</button>
                </form>
                <form action="/selectInterlocutor" method="geta">
                    <button>Select Interlocutor</button>
                </form>
			<div class="bodyWrapper">
				<div class="form messageForm">
				<div class="interlocuterName">${Interlocutor.getName()} ${Interlocutor.getAge()} y.o</div>
				<div class="messageBox">
				<c:forEach items="${Messages}" var="message">
					<div class="message">
						<div class="messageAuthor">${message.getSenderLogin()}</div>
						<div class="messageText">${message.getMessageText()}</div>
						<div class="messageDate">12:02</div>
					</div>
				</c:forEach>
				</div>
				<div class="answerForm">
					<input type="text" name="answer" placeholder="your message" id="messageField" class="answerField" />
					<button id="send" class="btn sendBtn">Send</button>
				</div>
				</div>
			</div>
		</div>
	</body>
</html>