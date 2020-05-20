<%@page import="org.springframework.boot.web.servlet.server.Jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>Spring Boot JSP</title>
</head>
<body>
<p>Hello</p>
<h2>${messenger}</h2>
<jsp:forward page="login.jsp"></jsp:forward>
</body>
</html>