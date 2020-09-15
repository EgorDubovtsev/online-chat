<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>"Online Chat"</title>
</head>
<body>
<h1>Registration in Online Chat</h1>
    <form:form action="registration/process" method="post" modelAttribute="registrationForm">
        <form:input type="text" path="name" placeholder="Name"/>
        <form:input type="text" path="age" placeholder="Age"/>
        <form:input type="text" path="login" placeholder="Login"/>
        <form:input type="password" path="password" placeholder="Password"/>
        <button>Enter</button>
    </form:form>
    <form:form action="login" method="get">
        <button>already have account?</button>
    </form:form>
</body>
</html>