<!DOCTYPE html>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>"Online Chat"</title>
</head>
<body>
<h1>Online Chat</h1>
    <form action="login/process" method="post">
        <input type="text" name="login" placeholder="Login"/>
        <input type="text" name="password" placeholder="Password"/>
        <button>Enter</button>
    </form>
    <form action="registration" method="get">
            <button>dont have an account?</button>
    </form>
</body>
</html>