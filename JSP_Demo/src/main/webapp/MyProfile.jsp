<%@page import="JSP_Demo.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String e=(String)session.getAttribute("uemail");
	RegisterModel rm=MyProfileDao.profile(e);
%>

	<table>
		MY Profile :
		<tr><td>ID : </td><td><%=rm.getId() %></td></tr>
		<tr><td>Name : </td><td><%=rm.getSname()%></td></tr>
		<tr><td>Branch : </td><td><%=rm.getBranch() %></td></tr>
		<tr><td>Email : </td><td><%=rm.getSemail() %></td></tr>
		<tr><td>Phone : </td><td><%=rm.getPhone() %></td></tr>
	</table>

</body>
</html>