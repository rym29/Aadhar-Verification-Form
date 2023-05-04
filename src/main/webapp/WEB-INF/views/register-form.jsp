<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Aadhar Registration Form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<h2>Aadhar Verification Registration Form</h2>

	<hr>
	<br>
	<form:form action="display" method="post" modelAttribute="user">

		<label for="name">User Name(*)</label>
		<form:input type="text" path="username" />
		<form:errors path="username" cssClass="error"></form:errors>
		<br>
		<br>
		<label for="password">Password(*)</label>
		<form:input type="password" path="userPass" />
		<form:errors path="userPass" cssClass="error"></form:errors>

		<br>
		<br>
		<label for="password">Confirm-Password</label>
		<form:input type="password" path="userCPass" />
		<form:errors path="userCPass" cssClass="error"></form:errors>

		<br>
		<br>
		<label for="id">Aadhar ID(*)</label>
		<form:input type="number" path="aadharId" />
		<form:errors path="aadharId" cssClass="error"></form:errors>

		<br>
		<br>
		<label for="emailid">Mail</label>
		<form:input type="text" path="emailId" />
		<form:errors path="emailId" cssClass="error"></form:errors>

		<br>
		<br>

		<label for="phone">Phone(*)</label>
		<form:input type="number" path="phone" />
		<form:errors path="phone" cssClass="error"></form:errors>

		<br>
		<br>
		<label>Enter State:</label>
		<form:select path="state">
			<%-- <form:option value="Delhi" label="Delhi" />
			<form:option value="UP" label="Uttar Pradesh" />
			<form:option value="HR" label="Haryana" />
			<form:option value="MH" label="Maharashtra" />
			<form:option value="PB" label="Punjab" /> --%>
			<form:options items='${user.stateOptions}' />
		</form:select>
		<form:errors path="state" cssClass="error"></form:errors>

		<br>
		<br>
		<label for="date">DOB(*)</label>
		<form:input type="date" path="date" placeholder="enter your dob" />
		<form:errors path="date" cssClass="error" />
		<br>
		<br>


		<%-- 	<label>Enter Tutor:</label>
		<form:select path="tutor">
			<form:options items='${user.tutorOptions}' />
			<form:errors path="tutor" cssClass="error" />


		</form:select> --%>
		<br>
		<br>
		<label>Gender: </label>
		Male<form:radiobutton path="Gender" value="Male" />  
        Female<form:radiobutton path="Gender" value="Female" />

		<br>
		<br>
		<label for="course">Course(*)</label>
		<form:input type="text" path="course" />
		<form:errors path="course" cssClass="error"></form:errors>
		<br>

		<%-- <label>Course Options: </label>
		<form:checkboxes path='course' items='${user.courseOptions}' />
		<br>
		<br> --%>
		<label>Other Verification Options: </label>
		<%-- PAN<form:checkbox path="otherOptions" value="PAN" />  
        Driving License<form:checkbox path="otherOptions"
			value="Driving License" />  
        Voter Id<form:checkbox path="otherOptions" value="Voter Id" />--%>
		<form:checkboxes path='other' items='${user.otherOptions}' />
		<br>
		<br>

		<label>Address Details(*)</label>
		<br>
		<form:textarea path="address" rows="5" cols="30" />
		<form:errors path="address" cssClass="error"></form:errors>
		<br>
		<br>

		<input type="submit" value="submit" />
		<input type="reset" value="clear" />
	</form:form>
</body>

</html>