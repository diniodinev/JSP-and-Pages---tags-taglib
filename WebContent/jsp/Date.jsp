<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%!boolean showDate = true;%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is the title.</h1>
	content version
	
	<%--This is expression --%>
	<% if(showDate){ %>
		<b>Today is: </b><%out.print(new Date().getHours()); %> H:
		<%out.print(new Date().getMinutes()); %> M:
		<%out.print(new Date().getSeconds()); %> S:
	<%} %> 
</body>
</html>


