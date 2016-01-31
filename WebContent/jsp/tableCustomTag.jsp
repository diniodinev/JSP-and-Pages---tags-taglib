<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ct" uri="http://example.bg/cutomTags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="date" value="<%=new java.util.Date()%>"></c:set>
<ct:page title="Some title">
	<jsp:body>
		<ct:verticalHeading>
			<jsp:attribute name="row1-title">
				Course
			</jsp:attribute>
			<jsp:attribute name="row1-value">
				Web Development Basics
			</jsp:attribute>
			<jsp:attribute name="row2-title">
				Date
			</jsp:attribute>
			<jsp:attribute name="row2-value">
				${date}
			</jsp:attribute>
		</ct:verticalHeading>
	</jsp:body>
</ct:page>