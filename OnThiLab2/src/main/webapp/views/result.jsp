<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ket Qua</title>
</head>
<body>
	<h1>Thong tin dang ky</h1>
	<ul>
		<li>Tên đăng nhập: <b>${param.username}</b></li>
		<li>Mật khẩu: <b>${param.password}</b></li>
		<li>Giới tính: <b>${param.gender}</b></li>
		<li>Tình trạng hôn nhân: <b>${param.married}</b></li>
		<li>Quốc tịch: <b>${param.country}</b></li>
		<li>Sở thích: <b>${paramValues.hobbies}</b></li>
		<li>Ghi chú: <b>${param.notes}</b></li>
	</ul>
</body>
</html>