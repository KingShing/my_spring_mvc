<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#but1").click(function() {
			var url = "ajax.do?name="+$("#name").val();
			$.get(url, function(str, status) {
				if (status == "success") {
					$("#ajaxdata").text(str);
				} else {
					alert(" status: " + status);
				}
			})
		});
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<h1>This is hello page</h1>
	name:
	<input type="text" name="name" id="name" />
	<input type="submit" id="but1" value="sure"> ajax:
	<p id="ajaxdata"></p>
</body>
</html>