<%@ page language="JAVA" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginController" method="post">
	<table>
		<tr>
			<td>Email</td>
			<td><input type="email" name="uemail"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="psw"></td>
		</tr>
		<tr>
			
			<td><input type="submit" value="Login"></td>
			<td><input type="reset" value="Cancel"></td>
		</tr>
	</table>
	New User <a href="register.html">Register</a> Here !!!
</form>

</body>
</html>