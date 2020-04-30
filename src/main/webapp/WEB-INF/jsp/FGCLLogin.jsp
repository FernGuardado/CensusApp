<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Cam
  Date: 2020-03-26
  Time: 1:04 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FGCLLogin</title>
</head>
<body>
    <h1 id="MainTitle" style="text-align: center">FGCLCensusApp</h1>
    <h2 id="SecondTitle" style="text-align: center">PROG3060 - Assignment 2</h2>
    <%@ include file="FGCLBanner.jsp" %>
    <section id="login" class="section">
        <h2>Log in</h2>
        <p style="color: red">${errorLogin}</p>
        <p style="color: cornflowerblue">${success}</p>
        <div class="container tagline">
            <form:form action="/login" method="POST" modelAttribute="login">
                <label>Username</label> <form:input type="text" path="username"/><br />
                <label>Password</label> <form:input type="password" path="password"/><br />
                <input type="submit" value="Login">
            </form:form>
            <a class="card-title" href="/FGCLRegister">Register new user? Click here</a>
        </div>
    </section>
    <%@ include file="FGCLFooter.jsp" %>
</body>
</html>
