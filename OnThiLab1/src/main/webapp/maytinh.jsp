<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MayTinh</title>
</head>
<body>
	<form action="/OnThiLab1/ketqua" method="post"> 
		<h1>Calculator</h1>
		<input name="a" type="text" value=""><br> 
		<input name="b" type="text" value=""><br> 
		<input type="submit" name="action" value="+"> 
		<input type="submit" name="action" value="-">
		<input type="submit" name="action" value="*"> 
		<input type="submit" name="action" value="/">
	</form>
</body>
</html>