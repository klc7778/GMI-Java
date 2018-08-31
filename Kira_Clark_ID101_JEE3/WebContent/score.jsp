<%@ page import="model.Grades,java.io.* ,javax.xml.parsers.*,javax.xml.transform.*, javax.xml.transform.dom.*,javax.xml.transform.stream.*,javax.xml.*,org.w3c.dom.*,model.Grades"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:useBean id="grades" class="model.Grades"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Grades</title>
</head>
<body>

<h2> You have been verified! </h2>

<a href = "mark.jsp">Show Student Marks</a>
</body>
</html>