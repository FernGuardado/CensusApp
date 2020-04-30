<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Fernando
  Date: 2020-03-29
  Time: 3:11 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FGCLRegister</title>
</head>
<body>
<h1 id="MainTitle" style="text-align: center">FGCLCensusApp</h1>
<h2 id="SecondTitle" style="text-align: center">PROG3060 - Assignment 2</h2>
<%@ include file="FGCLBanner.jsp" %>
<section id="login" class="section">
    <h2>Register</h2>
    <p style="color: red">${error}</p>
    <p style="color: cornflowerblue">${success}</p>
    <div class="container tagline">
        <form:form action="/registered" method="POST" modelAttribute="user">
            <label>Username: </label> <form:input type="text" path="username" /><form:errors path="username" cssClass="error"/><br />
            <label>Password: </label> <form:input type="password" path="password"/><form:errors path="password" cssClass="error"/><br />
            <label>Email: </label> <form:input type="email" path="email"/><form:errors path="email" cssClass="error"/><br />
            <label>Last Geographic Area: </label> <form:input type="text" path="lastGeoArea"/><form:errors path="lastGeoArea" cssClass="error"/><br />
            <input type="submit" value="Register">
        </form:form>
    </div>
</section>
</body>
<%@ include file="FGCLFooter.jsp" %>
</html>
