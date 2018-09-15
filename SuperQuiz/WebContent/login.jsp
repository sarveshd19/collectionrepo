<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Log In</title>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<script type="text/javascript" src="bootstrap.min.js"></script>
</head>
<body style="background: lightblue;">
	<jsp:include page="banner.jsp" />
	<div class="container" style="width: 60%;">
		<h1>Login</h1>
		<%
			if (request.getParameter("invalid") != null) {
		%>
		<div class="alert-danger">Invalid user ID/Password</div>
		<%
			}
		%>

		<%
			if (request.getParameter("valid") != null) {
		%>
		<div class="alert-success">Welcome to Super Quiz</div>
		<%
			}
		%>

		<%
			if (request.getParameter("changed") != null) {
		%>
		<div class="alert-success">Password Changed successfully</div>
		<%
			}
		%>
		<%
			if (request.getParameter("logout") != null) {
		%>
		<div class="alert-info">Logged out successfully</div>
		<%
			}
		%>
		<form action="user.quiz">
			<table class="table">
				<tr>
					<td><label>User ID:</label></td>
					<td><input name="userid" required></td>
				</tr>
				<tr>
					<td><label>Password:</label></td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="login"
						class="btn btn-success"> <input type="reset"
						class="btn btn-danger"></td>
				<tr>
					<td colspan="2"><a href="forgot.jsp">Forgot password</a></td>
				</tr>
				<tr>
					<td colspan="2"><h3>
							New here?? click <a href="register.jsp">here</a> to register
						</h3></td>
				</tr>
			</table>
		</form>
		<%@ include file="footer.html"%>
	</div>
</body>
</html>