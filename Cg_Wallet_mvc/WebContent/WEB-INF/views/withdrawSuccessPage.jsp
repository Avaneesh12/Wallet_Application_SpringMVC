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
<h2>Welcome Name: ${customer.name }</h2><br><br>
<h3>Name               :   ${customer.name }</h3><br>
<h3>Mobile Number      :   ${customer.mobileNo }</h3><br>
<h3>Remaining Balance  :   ${customer.wallet.balance }</h3><br>
<center>
	<h3>The amount has been successfully withdrawn.</h3>
	<p>For home page <a href="./loginSuccessPage">Click Here</a></p>
</center>
</div>
</body>
</html>