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
    <title>Banner</title>
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
<div class="nav">
    <ul>
        <li><a href="/FGCLHome">Home</a></li>
        <li><a href="/FGCLLogin">Login</a></li>
        <li><a href="/FGCLFindGeoLevelByLevel">Find By Level</a></li>
        <li><a href="/FGCLFindGeoAreaByKeyword">Find By Keyword</a></li>
    </ul>
</div>
</body>
</html>
