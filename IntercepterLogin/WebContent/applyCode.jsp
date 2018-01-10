<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Apply a new code</title>
</head>
<body>

	<%
		request.getSession().setAttribute("code", "shiyanlou");
	%>
	
	your INVITATION CODE is <b>shiyanlou</b><br />
	<a href="/IntercepterLogin/index.jsp" type="button">Back to login</a>

</body>
</html>