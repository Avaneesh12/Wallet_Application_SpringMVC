<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>Welcome Name    : ${customer.name }</h2><br>
		<h3>The following are the details :</h3><br>
		<br>
		<h2> Name           : ${customer.name } </h2>
		<h2> Mobile Number  : ${customer.mobileNo } </h2>
		<h2> Balance        : ${customer.wallet.balance } </h2>
	</div>
	<h3 align="center">The amount has been successfully deposited.</h3>
	<p>For home page <a href="./loginSuccessPage">Click Here</a></p>
</body>
</html>