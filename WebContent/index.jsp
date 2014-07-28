<%@page import="com.csc.util.MyTest"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%

MyTest tst = new MyTest();
String str = tst.getMessage();
%>
<body>
Here you go ...
<b>Got my first page</b>
<br>
<%=str %>
</body>
</html>