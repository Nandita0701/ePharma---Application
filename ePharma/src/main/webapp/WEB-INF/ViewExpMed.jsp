<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Medicine Details</title>

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


table,tr,td{
	border:1px solid black;
	border-collapse: collapse;
	background-color: #ecf0f1;
}
body{
	background-color:#2ecc71; 
}
</style>
</head>

<body>
	
	<center>
	<h2>View Expired Medicine Details</h2>
	<table>
		<tr>
			<td>Medicine ID</td>
			<td>Medicine Name</td>
			<td>Medicine Price</td>
			<td>Medicine Purpose</td>
			<td>Manufacturing Date</td>
			<td>Expiry Date</td>
			<td>Stock</td>
		</tr>

		<c:forEach var="med" items="${medList}">
			<tr>
				<td>${med.medId}</td>
				<td>${med.medName}</td>
				<td>${med.medPrice}</td>
				<td>${med.medPurpose}</td>
				<td>${med.mfgDate}</td>
				<td>${med.expDate}</td>
				<td>${med.stock}</td>
				<td><a href="delete/${med.medId}">Delete</a></td>
			</tr>
		</c:forEach>

	</table><br>
<a href="/home"><button>Home Page</button></a>
</center>
</body>
</html>