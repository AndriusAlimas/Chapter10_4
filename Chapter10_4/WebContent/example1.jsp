<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
<%@ taglib prefix="mine" uri="KathyClassicTags" %>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Classic Tag Handler</title>
</head>
<body>
	<h1>Classic Tag Handler with ONE method doStartTag()</h1>
 	<br>
 	Classic Tag One:<br>
 	<%-- this tag uses a Classic tag handler. But to the JSP, it looks just like any other tag invocation --%>
 	<mine:classicOne/>
</body>
</html>