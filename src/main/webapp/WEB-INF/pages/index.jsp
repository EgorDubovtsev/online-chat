<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
	<title>Chat</title>
	<link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700&display=swap" rel="stylesheet">
		<style>
            <%@include file="../../resources/css/main.css"%>
            <%@include file="../../resources/css/login.css"%>
    	</style>
</head>
	<body>
		<div class="background">
			<h1 class="header">Online Chat</h1>
			<div class="bodyWrapper">
				<div class="form messageForm">
				<div class="interlocuterName">${Interlocutor.name} ${Interlocutor.age} y.o</div>
				<div class="messageBox">
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
					<div class="message">
						<div class="messageAuthor">name</div>
						<div class="messageText">Extrimly stupid message example.</div>
						<div class="messageDate">12:02</div>
					</div>
				</div>
				<form class="answerForm">
					<input type="text" name="answer" placeholder="your message" class="answerField" />
					<button class="btn sendBtn">Send</button>
				</form>
				</div>
			</div>
		</div>
	</body>
</html>