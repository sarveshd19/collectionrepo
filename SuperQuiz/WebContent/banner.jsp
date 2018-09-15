<%@page import="lti.quiz.bean.RegisterBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
</head>
<body style="background: lightblue;">
	<div align="center"><h1 style="font-family: fantasy; color:maroon;">SuperQuiz.com</h1></div>
	<div align="center"><h2 style="color: teal;font-family: fantasy;"> Invoke your inner HERO!</h2></div>
	<%
		RegisterBean user = (RegisterBean) session.getAttribute("USER");
		if (user != null) {
	%>
	<div align="right">Hello: <%=user.getEmail()%> | <a href="user.quiz?logout=yes">Logout</a></div>
	<%
		} else {
	%>
	<div align="right">Welcome guest</div>
	<%
		}
	%>
</body>
</html>