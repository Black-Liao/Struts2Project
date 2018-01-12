<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>

	<h2>Type your information for register:</h2>
	
	<s:fielderror />
	<s:form action="register" method="post">
		<s:textfield label="username" name="user.name" tooltip="name must be over 3 characters!"></s:textfield>
		<s:textfield label="password" type="password" name="user.password" tooltip="password must over 6 digits"></s:textfield>
		<s:textfield label="confirmPassword" type="password" name="user.confirmPassword" tooltip="must same to password"></s:textfield>
		<s:textfield label="age" name="user.age" tooltip="age must over 16"></s:textfield>
		<s:textfield label="email" name="user.email" tooltip="input correct email format"></s:textfield>
		<s:textfield label="mobile" name="user.mobile" tooltip="input correct mobile phone number format"></s:textfield>
		<s:submit value="Register" />
	</s:form>

</body>
</html>