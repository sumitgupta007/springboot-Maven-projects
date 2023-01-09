<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error{
    position: fixed;
    color: red;
    margin: margin-left 30px;
    }
    
</style> 
<meta charset="ISO-8859-1">
<title>bill-page</title>

<div align="center">
<h1>Bill</h1>
<form:form action="success" method="get" modelAttribute="billdto">
<label>Credit Card:</label>
<form:input path="creditCard"/>
<form:errors path="creditCard" cssClass="error"></form:errors>
<br>
<label>Date:</label>
<form:input path="date"/>
<form:errors path="date" cssClass="error"></form:errors>
<br>

<label>Currency:</label>
<form:input path="currency"/>
<form:errors path="currency" cssClass="error"></form:errors>
<br>
<label>Amount:</label>
<form:input path="amount"/>
<form:errors path="amount" cssClass="error"></form:errors>
<br>
<br>
<input type="submit" value="Submit" >
<br>
</form:form>

</div>
</head>
<body>

</body>
</html>