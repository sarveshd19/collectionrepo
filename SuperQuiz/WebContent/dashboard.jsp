<%@page import="lti.quiz.bean.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
</head>
<%
	RegisterBean user = (RegisterBean) session.getAttribute("USER");
%>

<body style="background: lightblue; color: white;">
<jsp:include page="banner.jsp"/>
	<%
		if (request.getParameter("valid") != null) {
	%>
	<div class="alert-success">Login successful</div>
	<%
		}
	%>
	<div class="container">
		<h1>Welcome</h1>
		<h2><%=user.getEmail()%></h2>
		<img src="<%=user.getProfile()%>" height="200" width="250">
		<hr>
		<h2>Ever wondered which Super Hero you are?</h2>
		<a href="quiz.quiz" class="btn btn-info">Take this quiz to find out!</a>

<%@ include file="footer.html" %>
	</div>
</body>
</html>