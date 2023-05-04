<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Details</title>
</head>
<body>
	<h2>Entered Details Are</h2>
	<hr>
	<br>
	<h3>Name: ${updatedname}</h3>

	<h3>Password: ${user.userPass}</h3>


	<h3>AadharId: ${user.aadharId}</h3>

	<h3>Mail: ${user.emailId}</h3>
	<h3>Phone: ${user.phone}</h3>



	<h3>Gender: ${user.gender}</h3>

	<h3>State: ${user.state}</h3>

	<%-- <h3>Tutor: ${user.tutor}</h3> --%>


	<h3>Course: ${user.course}</h3>

	<h3>Other: ${user.other}</h3>

	<h3>Address: ${user.address}</h3>

	<hr>



</body>
</html>