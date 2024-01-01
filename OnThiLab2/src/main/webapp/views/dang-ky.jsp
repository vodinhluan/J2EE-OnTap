<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Dang Ky</title>
</head>
<body>
	<h1>Dang Ky</h1>
	<form action="/OnThiLab2/dang-ky" method="post">
		Ten dang nhap: <input name="username"> <br>
		Mat khau: <input name="password" type="password"> <br>
		Gioi tinh:
		 <input name="gender" type="radio" value="true">Nam
		 <input name="gender" type="radio" value="false">Nu <br>
		 <input name="married" type="checkbox"> Da co gia dinh?<br>
		Quoc tich: 
		<select name="country">
			<option name="VN">Viet Nam</option>
			<option name="USA">My</option>
		</select><br>
		So thich:
		Doc sach <input name="hobbies" value="DS" type="checkbox">
		Du lich <input name="hobbies"  value="DL" type="checkbox">
		Am nhac <input name="hobbies"  value="AN" type="checkbox">
		Khac <input name="hobbies"  value="K" type="checkbox"><br>
		
		Ghi chu: <textarea name="notes" rows="3" column="30"></textarea><br>
		<hr>
		<button>Dang Ky</button>
	</form>
</body>
</html>