<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fernando
  Date: 2020-02-22
  Time: 11:41 p.m.
  To change this template use File | Settings | File Templates.
--%>
<head>
<title>FGCLCensusApp - Search Level</title>
	<style>
		/* Table settings */
		table, th, td {
			border: 1px solid black;
			border-collapse: collapse;
		}
		table{
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
<section id="search" class="section">
	<div class="container">
		<h2 class="levelTitle">Search By Level</h2>
		<p style="color: red">${error}</p>
		<form action="/results" method="get">
			<input path="search" name="level" value="">
			<input type="submit" value="Search">
		</form>
	</div>
</section>
<hr>
<c:if test="${!empty(list)}">
	<table style="width:100%">
		<thead>
		<th>geoAreaID</th>
		<th>code</th>
		<th>name</th>
		<th>alternativeCode</th>
		</thead>
		<c:forEach items="${list}" var="item">
			<tbody>
			<tr>
				<td>${item.geographicAreaID}</td>
				<td>${item.code}</td>
				<td><a href="/FGCLGeoAreaDetails?alternativeCode=${item.alternativeCode}">${item.name}</a></td>
				<td>${item.alternativeCode}</td>
			</tr>
			</tbody>
		</c:forEach>
	</table>
</c:if>

</body>
<footer><%@ include file="FGCLFooter.jsp" %></footer>
</html>