<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>loginPage Page</title>
</head>
<body>
	<form action="loginAction" method="post">
		<table>
			<tr>
				<td>name:</td>
				<td><input type="text" id="username" name="username"></td>
			</tr>
			<tr>
				<td>password:</td>
				<td><input type="password" id="password" name="password"></td>
			</tr>
			<tr>
				<td><input id="submit" type="submit" value="register"></td>
			</tr>
		</table>
	</form>
</body>
</html>