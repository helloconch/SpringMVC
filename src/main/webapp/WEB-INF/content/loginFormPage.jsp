<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ModelAttribute Page</title>
</head>
<body>

	<form action="loginFormAction1" method="post">
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
				<td><input id="submit" type="submit" value="测试@ModelAttribute(value='')注释返回具体类的方法"></td>
			</tr>
		</table>
	</form>
	<hr>

	<form action="loginFormAction2" method="post">
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
				<td><input id="submit" type="submit" value="测试@ModelAttribute注释void返回值的方法"></td>
			</tr>
		</table>
	</form>
	<hr>
	<form action="hi" method="post">
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
				<td><input id="submit" type="submit" value="测试@ModelAttribute和@RequestMapping同时注释一个方法"></td>
			</tr>
		</table>
	</form>
	<hr>
	<form action="loginFormAction3" method="post">
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
				<td><input id="submit" type="submit" value="测试@ModelAttribute注释一个方法的参数"></td>
			</tr>
		</table>
	</form>
</body>
</html>