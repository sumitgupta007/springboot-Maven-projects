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
<title>registration</title>
</head>
<body>

<%-- <div align="center">
<h1 >Registration Page</h1>
<form action="/register" modelAttribute= "formdto">
<label >Name</label>
<input path="name">
<form:errors path="name"></form:errors>
<br>
<label >username</label>
<input path="username">
<form:errors path="username"></form:errors>
<br>
<label >age</label>
<input path="age">
<form:errors path="age"></form:errors>

<br>
<label >contact</label>
<input path="contact">
<form:errors path="contact"></form:errors>
<br>
<label >email</label>
<input path="email">
<form:errors path="email"></form:errors>

<br>
<label>Submit</label>
<input type="submit">
</form> --%>
<div align="center">
<h1>Registration Page!</h1>
 <form:form action="register" method="get" modelAttribute="formdto" >
  
<label for='n' >Name   :</label>
<form:input id='n' path="name"/>
<form:errors path="name" cssClass="error"></form:errors>
<br>
<label for='u' >UserName :</label>
<form:input id='u' path="username"/>
<form:errors path="username" cssClass="error"></form:errors>
<br>
<label for='a' >Age    :</label>
<form:input id='a' path="age"/>
<form:errors path="age" cssClass="error"></form:errors>
<br>
<label for='c' >Contact</label>
<form:input id='c' path="contact"/>
<form:errors path="contact" cssClass="error"></form:errors>
<br>
<label for='e' >Email</label>
<form:input id='e' path="email"/>
<form:errors path="email" cssClass="error"></form:errors>
<br>
<input type="submit" value="Submit" class="btn btn-primary">
<br>
</form:form>
</div>
   


</body>
</html>