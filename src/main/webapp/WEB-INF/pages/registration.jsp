<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>"Online Chat"</title>
</head>
<body>
<h1>Registration in Online Chat</h1>
    <form action="registration/process" method="post">
        <input type="text" placeholder="Name">
        <input type="text" placeholder="Age">
        <input type="text" placeholder="Login">
        <input type="password" placeholder="Password">
        <input type="button" value="Enter">
    </form>
    <form action="login" method="get">
        <button>already have account?</button>
    </form>
</body>
</html>