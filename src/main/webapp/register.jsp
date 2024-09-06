<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="f2" method="post" action="Ser1">
<center><h2>Registeration Form</h2></center><br>

<center>NAME:<input type="name" name="name" placeholder="enter your name" required></center><br>

<center>GENDER:
<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">Female
</center><br>

<center>BRANCH:
<tabel >
<select name="branch" value="sel" required>
<option >CSE</option>
<option >ECE</option>
<option >IT</option>
</select>
</tabel>
</center><br>

<center>EMAIL:<input type="email" name="mail" placeholder="enter your username" required></center><br>

<center>PASSWORD:<input type="password" name="password" placeholder="enter your password" required></center><br>

<center><button type="submit">Register</button></center>
</form>
</body>
</html>