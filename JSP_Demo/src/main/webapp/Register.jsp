<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >
<form action="RegisterController" method="post" >
	
	<table align="center">
	<h2 align="center">!!! Student Information !!!</h2>
	<hr size=5 color=black>
		<tr>
			<td>Full Name</td>
			<td><input type="text" name="sname"></td>
		</tr>
		<tr>
				<td>Email</td>
				<td><input type="email" name="semail"></td>
		</tr>
		<tr>
				<td>Phone</td>
				<td><input type="text" name="phone"></td>
		</tr>
		<tr>
				<td>Password</td>
				<td><input type="password" name="psw"></td>
		</tr>
		<tr>
				<td>Gender</td>
				<td>M<input type="radio"name="gender"value="M"></td>
				
				<td>F<input type="radio"name="gender"value="F">
				</td>
		</tr>
		<tr>
				<td>Branch</td>
				<td>
					<select name="branch">
						<option>Branch</option>
						<option>Computer</option>
						<option>E&tc</option>
						<option>IT</option>
						<option>Mechanical</option>
						<option>Civil</option>
					</select>>
				</td>
		</tr>
		<tr>
				<td>Addmition Date</td>
				<td><input type="date" name="ad"></td>
		</tr>
		<tr>
				
				<td><input type="submit" value="Register"></td>
		</tr>
		
	</table>
	<hr size=5 color=black>
</form>
</body>
</html>