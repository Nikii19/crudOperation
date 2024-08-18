<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="edit" method="post">
id:<input type="text" name="pk" value="<%=request.getParameter("id")%>" readonly="readonly"><br>
mobile:<input type="number" name="umob" value="<%=request.getParameter("mob")%>"><br>
name:<input type="text" name="un" value="<%=request.getParameter("name")%>"><br>
email:<input type="email" name="ue" value="<%=request.getParameter("email")%>"><br>
<button>update</button>
</form>
</body>
</html>