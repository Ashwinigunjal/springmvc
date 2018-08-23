<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
.error{

	color:red;
}

</style>
<body>
<i>All (*) field is required</i>
<table>
<form:form method="post" action="processform" modelAttribute="student">
<tr>
	<td>Enter Name (*) </td>
	<td>:</td>
	<td><form:input path="name"/></td>
</tr>
<tr>
	<td>Enter Email (*)</td>
	<td>:</td>
	<td> <form:input path="email"/></td>
	
</tr>

<tr>

	<td>Enter Age </td>
	<td>:</td>
	<td> <form:input path="age" /></td>
	
</tr>

<tr>
	<td>Enter Password (*)</td>
	<td>:</td>
	<td> <form:input path="password"/>
		<form:errors path="password"  cssClass="error"></form:errors>
	</td>
	
</tr>

<tr>
	<td>Enter Country </td>
	<td>:</td>
	<td> <form:select path="country">
 
	<form:option value="Sangamner" label="Sangamner"></form:option>
	<form:option value="Loni" label="Loni"></form:option>
	<form:option value="Akole" label="Akole"></form:option>

	</form:select>
	</td>	
</tr>
</table>
<br>
<form:radiobutton path="favlang" value="PHP" label="PHP"/>
<form:radiobutton path="favlang" value="R" label ="R"/>
<form:radiobutton path="favlang" value="java" label="java"/>
<br><br>
<form:checkbox path="os" value="linux" label="linux"/>
<form:checkbox path="os" value="window" label="window"/>
<br><br>

<input type="Submit" value ="submit"/>


</form:form> 

</body>
</html>