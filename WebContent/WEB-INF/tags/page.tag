<%@ tag description="Simple Page Tag" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ct" uri="http://example.bg/cutomTags"%>
<%@ attribute name="title" %>
<%!boolean date = true;%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Tag Title.</title>
</head>
<body>
<ct:header title="${title}"/>

<jsp:doBody/>
<ct:footer version="1.0.1"/>
<% if(date){ %>
	<jsp:useBean id="today" class="java.util.Date"/>
	<b>Today is ${today}</b>
	<%} %> </h10>
	
</body>
</html>