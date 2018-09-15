<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Password</title>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
</head>
<body style="background: lightblue;">
<jsp:include page="banner.jsp"/>
	<div class="container" style="width: 80%;">
		<h1>Forgot Password</h1>
		<%
			if (request.getParameter("invalid") != null) {
		%>
		<div class="alert-danger">Invalid Credentials</div>
		<%
			}
		%>
		<form action="user.quiz">
			<table class="table table-border table-hover table-condensed">
				<tr>
					<td><label>Enter Username:</label></td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td><label>Who is your favorite superhero?</label></td>
					<td><input type="text" required name="answer"></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit"
						class="btn btn-primary"></td>
				</tr>
			</table>
		</form>
		<%@ include file="footer.html" %>
	</div>
</body>
</html>