<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style><%@include file="/WEB-INF/views/css/login.css"%></style>
    <!-- <link rel="stylesheet" type="text/css" href="../css/login.css"> -->
    <title>Log in</title>
</head>

<body>

	<jsp:include page="header.jsp"></jsp:include>

    </div>

    <div class="container-login-form">
        <form class="form-login" action="" method="post"  onsubmit="return login()">
            <label class="label-login">LOGIN</label>
            <input id="username" name="username" class="element" type="text" placeholder="Tên tài khoản">
            <input id="password" name="password" class="element" type="password" placeholder="Password">
            <div>
                <input id="btn-login" class="button-login" type="submit" value="Đăng nhập">
                <input class="button-signup" type="button" value="Sign In">
            </div>
            <label>${messenger}</label>
        </form>
    </div>

    <script>
        function validateEmail(email) {
            var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
            return re.test(email);
        }

        function login() {
            var email = document.getElementById("username").value;
            var password = document.getElementById("password").value;

            if(!validateEmail(email)){
                alert('Bạn nhập không đúng định dạng email!');
                return false;
            }
            else if(password.length < 6){
                alert('Mật khẩu phải trên 6 kí tự!');
                return false;
            }

            return true;
        }
    </script>
</body>

</html>