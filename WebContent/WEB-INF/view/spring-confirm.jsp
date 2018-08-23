<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>student confirm page</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
<h1>Student Information</h1>
<table col="2">
	<tr>
		<th>Name</th>
		<th>Password</th>
		<th>Country</th>
		<th>Language</th>
		<th>Email</th>
		<th>Age</th>
	</tr>
	<tr>
		<td>${student.name}</td>
		<td>${student.password}</td>
		<td>${student.country}</td>
		<td>${student.favlang}</td>
		<td>${student.email}</td>
		<td>${student.age}</td>
	</tr>
	
</table>

<%-- <p>${student.name}</p>
<p>${student.password}</p>
<p>${student.country} </p>
<p>${student.favlang} </p> --%>


<h3>Fav Operating System</h3>
<ul>

<c:forEach var="tmp" items="${student.os}">

	<li>${tmp}</li>

</c:forEach>


</ul>





</body>
</html>