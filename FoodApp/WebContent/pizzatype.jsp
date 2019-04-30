<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
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
	background-color: #111;
}

.style6 {
	font-size: 24px;
	text-align: center;
}

}
.dropbtn {
	background-color: #4CAF50;
}

.dropdown {
	position: relative;
	display: inline-block; .
	style25 {color: #990099
}

.style32 {
	font-size: 18px
}
</style>
</head>

<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
body {
	font-size: 20px;
	padding: 0px;
}

.image {
	background-image: url('images/p2.jpg');
	background-size: 100%;
	height: 800px;
	position: fixed;
	left: 0;
	right: 0;
	z-index: -1;
	filter: blur(5px);
	-webkit-filter: blur(5px);
}

.heading {
	z-index: 2;
}

}
.aa {
	color: #330066;
	font-size: 18px;
}

}
body,td,th {
	font-family: Times New Roman, Times, serif;
	font-size: 100px;
}

.style19 {
	font-style: italic;
	font-size: 24px;
	color: #FFFFFF;
}

.style20 {
	color: #993300
}

.style29 {
	color: #000000
}

.style31 {
	color: #000000;
	font-size: 20px;
}

.style33 {
	font-size: 24px;
	font-weight: bold;
}

.style37 {
	color: #006600;
	font-weight: bold;
}

.style40 {
	font-size: 18px
}
</style>
</head>



<div>
	<ul>
		<li margin="top"><span class="style19">Foddie.<span
				class="style20">com</span></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</li>


		<li align="center"><a href="minor.html" class="active style6">
				Welcome</a></li>
		<li align="center"><a href="homepage.html" class="active style6">
				Home</a></li>
		<li align="center"><a href="minor2.html" class="style6">About
				us</a></li>
		<li align="center"><a href="#contact" class="style6">Register</a></li>
		<li align="center">
			<div align="justify">
				<a href="#about" class="style6">Login</a>
			</div>
		</li>
</div>
<body>
<%@ page import="com.foddiee.dao.FoodDetailDao,com.foodiee.model.*,java.util.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%
List<FoodDetail> list = FoodDetailDao.getItemDetail();
request.setAttribute("list", list);
%>
	<div class="image"></div>
	<div class="heading">
		<h1 align="center" class="style29">
			<em>Welcome to just eat pizza</em>
		</h1>
		<p class="style31 style33">Pizza</p>
		<table style="width: 50%">
		<c:forEach items="${list}" var="u">
		<tr>
		    <td>${u.getSno()}</td>
		   <%--  <td>${u.getItemtype()}</td> --%>
		    <td>${u.getItemname()}</td>
		    <td>${u.getItemprice()}</td>
		    <td><button>Add +</button></td>
		</tr>
		</c:forEach>
		</table>
		<p class="style31 style32">
			1. Plain cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.130</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			2. Vegetable cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.120</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			3. Volcano cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			4. Smoky Volcano pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			5. Capsicum cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			6. Corn cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			6. Garlic cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			8. Panner cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			9. American cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			10. Tandoori cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			11. Jain cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
		<p class="style31">
			12. Jain panner cheese pizza&nbsp&nbsp&nbsp<span class="style40">Rs.170</span>&nbsp&nbsp&nbsp&nbsp&nbsp
			<button>
				<span class="style37">Add +</span>
			</button>
	</div>
</body>
</html>
