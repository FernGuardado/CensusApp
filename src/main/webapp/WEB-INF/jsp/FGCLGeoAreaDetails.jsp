<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fernando
  Date: 2020-02-23
  Time: 2:54 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>FGCLCensusApp Geo Details</title>
    <style>
        table, td, th {
            border: 1px solid black;
        }

        table {
            border-collapse: collapse;
            width: 100%;
        }
        hr{
            border: solid black;
        }
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: cornflowerblue;
        }

        li {
            float: left;
        }

        li a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        li a:hover {
            background-color: cadetblue;
        }
    </style>
</head>
<body>
<h1 id="MainTitle" style="text-align: center">FGCLCensusApp</h1>
<h2 id="SecondTitle" style="text-align: center">PROG3060 - Assignment 2</h2>
<%@ include file="FGCLBanner.jsp" %>
<hr>
<c:if test="${!empty(geoDetailsList)}">
    <section id="GeoDetails" class="section">
        <c:forEach items="${geoDetailsList}" var="item">
            <table>
                <tr>
                    <th style="text-align: center;"><b>GEOGRAPHIC AREA DETAILS</b></th>
                </tr>
                <tr>
                    <th style="color: white; text-align: center; background-color: red">${item.fgclGeographicArea.name}</th>
                </tr>
                <tr>
                    <td><b>Geographic Area ID: ${item.fgclGeographicArea.geographicAreaID}</b></td>
                </tr>
                <tr>
                    <td><b>Code: ${item.fgclGeographicArea.code}</b></td>
                </tr>
                <tr>
                    <td><b>Level: ${item.fgclGeographicArea.level}</b></td>
                </tr>
                <tr>
                    <td><b>Alternative Code: ${item.fgclGeographicArea.alternativeCode}</b></td>
                </tr>
                <tr>
                    <td><b>Total Population: ${item.combined}</b></td>
                </tr>
                <tr>
                    <td><b>Male: ${item.male}</b></td>
                </tr>
                <tr>
                    <td><b>Female: ${item.female}</b></td>
                </tr>
            </table>
        </c:forEach>
    </section>
</c:if>
</body>
<footer><%@ include file="FGCLFooter.jsp" %></footer>
</html>
