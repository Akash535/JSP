<%@page import="JSP_Demo.* ,java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="BranchSearch.jsp" >
	<table>
		<tr>
			<td>Branch</td>
			<td><select name="branch">
				<option>Branch</option>
				<option>Computer</option>
				<option>E&tc</option>
				<option>IT</option>
				<option>Mechanical</option>
				<option>Civil</option>
			</select></td>
		</tr>
		<tr>
			<td><input type="submit" value="Search"></td>
		</tr>
	</table>
</form> 
	
	
	
	<table>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Gender</th>
		</tr>
		<%
			if(request.getParameter("branch")!=null)
			{
			String d=request.getParameter("branch");
				out.println("Branch : "+d);
				List<RegisterModel> l=BranchSearchDao.Search_Branch(d);
				for(RegisterModel rm:l)
				{
			
		%>
		
				<tr>
					<td><%= rm.getId() %></td>
					<td><%= rm.getSname() %></td>
					<td><%= rm.getSemail() %></td>
					<td><%= rm.getGender() %></td>
					<td><%= rm.getPhone() %></td>
				</tr>
			<%
			}
		}
			%>
</table>
</body>
</html>