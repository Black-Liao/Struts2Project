<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Upload Success</title>
</head>
<body>

	<%
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	%>

	 upload succeed!!!<br/>
	<%-- uploader:${uploader }
	file name : ${uploadFileName }
	file type : ${uploadContentType }
	file address : <p><%=basePath %> ${uploadFiles }  + ${uploadFileName }</p><br /> --%>

	<%-- uploader : <s:property value=" + uploader"/><br />
	file name : <s:property value=" + uploadFileName"/><br />
	file type : <s:property value=" + uploadContentType"/><br />
	file address : <p><%=basePath %><s:property value="'uploadFiles/' + uploadFileName"/></p><br /> --%>
	
	file name : <s:property value=" + uploadsFileName[0]"/><br />
	file type : <s:property value=" + uploadsContentType[0]"/><br />
	file address : <p><%=basePath %><s:property value="'uploadsFiles/' + uploadsFileName[0]"/></p><br />

	file name : <s:property value=" + uploadsFileName[1]"/><br />
	file type : <s:property value=" + uploadsContentType[1]"/><br />
	file address : <p><%=basePath %><s:property value="'uploadsFiles/' + uploadsFileName[1]"/></p><br />
	
	file name : <s:property value=" + uploadsFileName[2]"/><br />
	file type : <s:property value=" + uploadsContentType[2]"/><br />
	file address : <p><%=basePath %><s:property value="'uploadsFiles/' + uploadsFileName[2]"/></p><br />

</body>
</html>