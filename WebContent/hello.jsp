<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.0/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	    //提交数据
		$("#but1").click(function() {
			$.ajax({
				 url : "ajaxObj.do",
				 type : "POST",
				 dataType : "JSON",
				 data : { 
					 		"name":$("#name").val(),
					 		"password":$("#password").val(),
						 }, 
				 success : function (data) {
					 console.log(data) 
					 $parent = $("#ajaxdata").parent();
					 $parent.append("<p>"+data.name+"</p>"),
					 $parent.append("<p>"+data.password+"</p>")},
				})
		});
});
</script>
<style type="text/css">
.lable{
	text-align: left;
	width:100px;
	display: inline-block;
}
#but1{
	width: 100px;
}

</style>
<title>Insert title here</title>
</head>
<body>
	<h1>This is login page</h1>
	<span class="lable">name:</span>
	<input type="text" name="name" id="name" /><br/>
	<span class="lable">password:</span>
	<input type="password" name="password" id="password" />
	<input type="button" id="but1" value="sure"> <br>
	<span class="lable" id="ajaxdata"  >ajax:</span>
</body>
</html>