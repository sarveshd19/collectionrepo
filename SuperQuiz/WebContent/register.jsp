<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
</head>
<body style="background: lightblue;">
<jsp:include page="banner.jsp"/>
	<div class="container" style="width: 70%;">
		<h1>Sign Up</h1>
		<%
			if (request.getParameter("invalid") != null) {
		%>
		<div class="alert-danger">User already exists</div>
		<%
			}
		%>
		<form action="user.quiz">
			<table class="table table-border table-hover">
				<tr>
					<td><label>Enter email:</label></td>
					<td><input type="email" required name="email"></td>
				</tr>
				<tr>
					<td><label>Enter password:</label></td>
					<td><input type="password" required name="pass"></td>
				</tr>
				<tr>
					<td><label>Re type password:</label></td>
					<td><input type="password" required name="pass1"></td>
				</tr>
				<tr>
					<td><label>Who is your favorite superhero?</label></td>
					<td><input type="text" name="answer"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="submit"
						class="btn btn-success"> <input type="reset"
						class="btn btn-danger"></td>
				</tr>
			</table>
		</form>
		<%@ include file="footer.html" %>
	</div>
</body>
</html>