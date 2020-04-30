<%@ page import="com.Assignment1.FGCLCensusApp.beans.FGCLUser" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Cam
  Date: 2020-03-26
  Time: 1:03 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1 id="MainTitle" style="text-align: center">FGCLCensusApp</h1>
    <h2 id="SecondTitle" style="text-align: center">PROG3060 - Assignment 2</h2>
    <%@ include file="FGCLBanner.jsp" %>
    <p>${welcome}</p>
    <img src="https://upload.wikimedia.org/wikipedia/commons/9/97/Circle-icons-Canada.svg">
    <p style="color: cornflowerblue">${success}. <a href="/FGCLLogin">Go to login</a></p>
    <c:if test="${!empty(welcome)}">
        <a href="/getGeoArea">Click here to find last geo location visited</a>
    </c:if>
</body>
<%@ include file="FGCLFooter.jsp" %>
</html>