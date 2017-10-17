<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>welcome to hi.jsp</title>
</head>
<body>
	<h3>welcome to hi page</h3>
	<h4>${requestScope.message}</h4>
	<h4>${requestScope.username}</h4>
	<h4>${requestScope.password}</h4>
	<h4>${requestScope.user.username}</h4>
	<h2>欢迎${sessionScope.user.username}登录</h2>
</body>
</html>