<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>jsonPage</title>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
  
	$(document).ready(function() {
		testBodyRequest();
	});

	function testBodyRequest() {

		$.ajax({
			type : 'POST',
			dataType : 'json',
			url : '${pageContext.request.contextPath}/json/testRequestBody',
			contentType : 'application/json',
			data : JSON.stringify({
				id : 1,
				name : "SpringMVC"
			}),
			async : true,
			success : function(data) {
				$("#id").html(data.id);
				$("#name").html(data.name);
				$("#author").html(data.author);
			},
			error : function(e) {
				alert(e.responseText);
				alert("send data error");
			}
		});
	}
</script>
</head>
<body>
	id:
	<span id="id"></span>
	<br /> name:
	<span id="name"></span>
	<br /> author:
	<span id="author"></span>
	<br />
</body>
</html>