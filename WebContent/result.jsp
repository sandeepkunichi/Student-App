<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student details</title>
<h1>Student Marks List</h1>
</head>
<body bgcolor="#aaafff" style="height:100%;width:100%;">
<table cellpadding="3" cellspacing="3" border="3">
	<tr>
	<td colspan="4">USN</td><td colspan="4"><%=(String) request.getAttribute("USN") %></td>
	</tr>
	<tr>
	<td colspan="4">NAME</td><td colspan="5"><%=(String) request.getAttribute("name") %></td>
	</tr>
	<tr>
	<td colspan="4">I SEM</td><td style="width:50px"><%=(String) request.getAttribute("sem1") %></td><td style="width:50px" maxlength="4"><%=(String) request.getAttribute("sem1g") %></td>
	</tr>
	<tr>
	<td colspan="4">II SEM</td><td style="width:50px"><%=(String) request.getAttribute("sem2") %></td><td style="width:50px"><%=(String) request.getAttribute("sem2g") %></td>
	</tr>
	<tr>
	<td colspan="4">III SEM</td><td style="width:50px"><%=(String) request.getAttribute("sem3") %></td><td style="width:50px"><%=(String) request.getAttribute("sem3g") %></td>
	</tr>
	<tr>
	<td colspan="4">IV SEM</td><td style="width:50px"><%=(String) request.getAttribute("sem4") %></td><td style="width:50px"><%=(String) request.getAttribute("sem4g") %></td>
	</tr>
	</table>
</body>
</html>