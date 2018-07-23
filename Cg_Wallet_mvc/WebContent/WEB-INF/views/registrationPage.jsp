<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style>
.error {
	color: red;
	font-weight: bold;
}

table {
    border-collapse: collapse;
}

td {
    padding-top: .5em;
    padding-bottom: .5em;
}
</style>
</head>
<body>
	<div align="center">
		<h1>Welcome to Registration Page</h1>
		<table>
			<form:form action="registerCustomer" method="post" modelAttribute="customer">
				<tr>
					<td>Customer Name:</td>
					<td><form:input path="name" size="30" /></td>
					<td><form:errors path="name" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Customer Mobile No:</td>
					<td><form:input path="mobileNo" size="30" /></td>
					<td><form:errors path="mobileNo" cssClass="error" /></td>
				</tr>

				<tr>
					<td>Customer Balance:</td>
					<td><form:input path="wallet.balance" size="30" /></td>
					<td><form:errors path="wallet.balance" cssClass="error" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="submit"/></td>
				</tr>
			</form:form>
		</table>


	</div>
</body>
</html>