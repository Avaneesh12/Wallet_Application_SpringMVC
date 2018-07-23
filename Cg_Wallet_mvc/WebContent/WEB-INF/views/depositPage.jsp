<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deposit</title>
<style>
	.button
{
  width: 150px;
  text-align: center;
  margin:0 auto;

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
		<h2>Deposit Amount</h2>
	</div>
	
		<form:form action="depositPage" method="post" >
		<table align="center">
				<tr>
					<td>Enter Customer Mobile No:</td>
					<td><input type="text" name="mobileNo" placeholder="Enter your Mobile Number"/>
				</tr>
				<tr>
					<td>Enter deposit amount:</td>
					<td><input type="text" name="amount" placeholder="Deposit Amount"/></td>
				</tr>
				
				<tr>
					<td></td>
					<td><input class="button" type="submit" value="submit" align="middle" /></td>
				</tr>
				</table>
		</form:form>
	
</body>
</html>