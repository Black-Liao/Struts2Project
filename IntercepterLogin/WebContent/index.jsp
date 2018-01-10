<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Interceptor</title>
</head>
<body>

	<center>
		<h2>${sessionScope.msgSession }</h2>
		<s:form action="interceptorLogin" method="post">
			<s:textfield label="INVITATION CODE" name="inputCode"></s:textfield>
			<s:submit value="Login" />
		</s:form>
		
		<a href="/IntercepterLogin/applyCode.jsp" type="button">Apply a code</a>
	</center>

</body>
</html>