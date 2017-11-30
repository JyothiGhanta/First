<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
<style type="text/css">
.errMsg{
	color: red;
	font-size: 14px;
	font-style:italic;
	font-weight: bold;
}

</style>

</head>
<body>
<form:form action="saveEmployee" method="post" commandName="employee">
<h1 align="center"> Employee Details</h1>

<table>
	<tr>
		<td>Employee Id</td>
		<td>
			<form:input path="empId"/>
		</td>
		<td>
		</td>
	</tr>
	
	<tr>
		<td>FirstName</td>
		<td>
			<form:input path="firstName"/>
		</td>
		<td>
			<form:errors path="firstName" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>LastName</td>
		<td>
			<form:input path="lastName"/>
		</td>
		<td>
			<form:errors path="lastName" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>Salary</td>
		<td>
			<form:input path="salary"/>
		</td>
		<td>
			<form:errors path="salary" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>Date of Birth</td>
		<td>
			<form:input path="emoDob"/>
		</td>
		<td>
			<form:errors path="emoDob" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>Date of joining</td>
		<td>
			<form:input path="emoDoj"/>
		</td>
		<td>
			<form:errors path="emoDoj" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	
	<tr>
		<td>Employee EmailID</td>
		<td>
			<form:input path="email"/>
		</td>
		<td>
			<form:errors path="email" cssClass="errMsg"></form:errors>
		</td>
	</tr>
	<tr>
		<td></td>
		<td>
			<input type="submit" value="Save">
		</td>
	</tr>
	
	<tr>
		<td>
		
		</td>
		<td>
			<form:errors path="*"></form:errors>
		</td>
		<td>
			
		</td>
	</tr>
	
</table>
</form:form>
</body>
</html>