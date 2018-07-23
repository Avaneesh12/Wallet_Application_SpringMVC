<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<div align="center">
		<h2>Welcome Name : ${customer.name }</h2><br>
		<h2>Name           : ${customer.name }</h2>
		<h2>Mobile Number  : ${customer.mobileNo }</h2>
		<h2>Balance        : ${customer.wallet.balance }</h2>
	
		<button><a href="deposit">Deposit Amount</a></button>
		<button><a href="withdraw">Withdraw Amount</a></button>
		<button><a href="transfer">TransferBalance</a></button>
		<p>Go to home page <a href="./">Click Here!</a>
	</div>
</body>
</html>