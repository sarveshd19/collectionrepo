<%@page import="lti.quiz.bean.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
</head>
<body style="background-color:skyblue;color:azure">
<jsp:include page="banner.jsp" />
<div class="container">
<h1>You resembles to Super Hero</h1>
<% String hero = (String) request.getAttribute("Hero"); %>
<%RegisterBean register = new RegisterBean();
register.setProfile(hero);%>
<img src="<%= hero %>">
<a href="dashboard.jsp">Go to dashboard</a>
<%@ include file="footer.html" %>
</div>

</body>
</html>