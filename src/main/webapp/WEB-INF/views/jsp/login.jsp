<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/WEB-INF/views/css/login.css"%></style>
    <title>Log in</title>
</head>
<body>
    <div>
        <form class="form-login" action="" method="post">
            <label class="label-login">LOGIN</label>
            <input name="username" class="element" type="text" placeholder="Tên tài khoản">
            <input name="password" class="element" type="password" placeholder="Password">
            <div>
                <input class="button-login" type="submit" value="Đăng nhập">
                <input class="button-signup" type="button" value="Sign In">
            </div>
        </form>
    </div>
</body>
</html>