<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bill-paid</title>


</head>
<body>
<div align="center">
<h1>Bill paid Successfully!!!</h1>

Credit Card:${billdto.creditCard.getFnumber()}-${billdto.creditCard.getSnumber()}-${billdto.creditCard.getTnumber()}-${billdto.creditCard.getFourthnumber()}-${billdto.creditCard.getFifthnumber()}             
<br>
Date:  ${billdto.date }
Currency:  ${billdto.currency }
Amount:    ${billdto.amount }

</div>

</body>
</html>