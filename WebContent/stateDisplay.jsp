<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.text.*, ateam.model.Bihin" %>
<% List<Bihin> list = (List<Bihin>)request.getAttribute("list"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>現在の借りている備品表示</title>
</head>
<body>
<TABLE BORDER ="1">

<TR>
<TH>bihinID
<TH>nihinName
<TH>bihinKana
<TH>status
<TH>userID
<TH>returnDay
<%
	for(int i=0; i<list.size(); i++) {
		Bihin bihin = list.get(i);
%>
	<tr>
		<td><%= bihin.getBihinID() %>
		<td><%= bihin.getBihinName() %>
		<td><%= bihin.getBihinKana() %>
		<td><%= bihin.getStatus() %>
		<td><%= bihin.getUserID() %>
		<td><%= bihin.getReturnDay() %>
<%
	}
%>

</TABLE>
</body>
</html>