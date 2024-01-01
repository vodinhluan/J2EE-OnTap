<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Tam Giac</title>
</head>
<body>
	<h1>TAM GIAC</h1>
	<form action="/OnThiLab2/tam-giac" method="post">
		<input name="a" placeholder="Canh a?: "></input><br>
		<input name="b" placeholder="Canh b?: "></input><br>	
		<input name="c" placeholder="Canh c?: "></input><br>
		<button formaction="/OnThiLab2/dien-tich">Tinh Dien Tich: </button><br>
		<button formaction="/OnThiLab2/chu-vi">Tinh Chu Vi: </button><br>
	</form>
	<h3>${message}</h3>
</body>
</html>