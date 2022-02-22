<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add book details</title>
<style type="text/css">
.error {
	border: 1px solid red;
	
}

p1{
	color:red;
}

h2{
	align: center;
}


table{
	/* border:1px solid black; */
	box-shadow:0 0 10px #333;
}
body{
	background-color:#3498db; 
}
</style>
</head>
<body>
<center>
<h2>Add Medicine Details</h2>
<a href="/home"><button>Home Page</button></a>
<a href="/expMedicine"><button>Expiry Medicines</button></a>
<p1>${msg}</p1>
<p1></p1>

	<form:form action="/addMedDetails" modelAttribute="med">
	<br>
		<table>
			<tr>
				<td>Medicine Name</td>
				<td><input id="medName" type="text" name="medName" ></td>
				<td><form:errors path="medName" cssClass="error"></form:errors></td>
				<td></td>
			</tr>

			<tr>
				<td>Medicine Price</td>
				<td><input id="medPrice" type="number" step="0.01" name="medPrice" ></td>
				<td><form:errors path="medPrice" cssClass="error"></form:errors></td>
				<td></td>
			</tr>

			<tr>
				<td>Medicine Purpose</td>
				<td><input id="medPurpose" type="text" name="medPurpose"></td>
				<td><form:errors path="medPurpose" cssClass="error"></form:errors></td>
				<td></td>
			</tr>
			
			<tr>
				<td>Manufacturing Date</td>
				<td><input id="mfgDate" type="date" name="mfgDate" ></td>
				<td><form:errors path="mfgDate" cssClass="error"></form:errors></td>
				<td></td>
			</tr>
			
			<tr>
				<td>Expiry Date</td>
				<td><input id="expDate" type="date" name="expDate" ></td>
				<td><form:errors path="expDate" cssClass="error"></form:errors></td>
				<td>${errormsg}</td>
				<td></td>
			</tr>
			
			<tr>
				<td>Stock</td>
				<td><input id="stock" type="radio" name="stock" value="yes">yes</input></td>
				<td><input id="stock" type="radio" name="stock" value="no">no</td>
				<td><form:errors path="stock" cssClass="error"></form:errors></td>
			</tr>
			
		</table><br>
		<button type="submit">Add Details</button>
	</form:form>	
	</center>
</body>
</html>