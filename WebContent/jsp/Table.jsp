<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!int i = 10;%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Table content.</title>
</head>
<body>
	<h1>Current date</h1>
	<h2>
		<%
			out.print(new Date());
		%>
	</h2>
	<table border="1">
		<thead>
			<tr>
				<td>Topic</td>
				<td>Date</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Web Development Basics</td>
				<td>4 януари 2016</td>
			</tr>
			<tr>
				<td>Servlets and Pages</td>
				<td>21 януари 2016</td>
			</tr>
		</tbody>
	</table>
</body>
</html>