<%@page import="servlet_crud_dto.Studentdto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<%List<Studentdto> std=(List<Studentdto>)request.getAttribute("objects"); %>
<table border="">
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
<th>gender</th>
<th>mobile</th>
<th>delete</th>
<th>update</th>
</tr>
<% for(Studentdto a:std){ %>
<tr>
<td><%=a.getId()%></td>
<td><%=a.getName()%></td>
<td><%=a.getEmail()%></td>
<td><%=a.getGender() %></td>
<td><%=a.getMobile() %></td>
<td><a href="deletebyid?primarykey=<%=a.getId()%>">remove</a></td>
<td><a href="update.jsp?id=<%=a.getId()%>&&mob=<%=a.getMobile()%>&&name=<%=a.getName()%>&&email=<%=a.getEmail()%>">edit</a></td>
</tr>
	<% } %>
</table>
</form>
</body>
</html>