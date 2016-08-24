<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.text.*, ateam.model.Bihin, ateam.model.User" %>
<% List<Bihin> list = (List<Bihin>)request.getAttribute("list"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マイページ</title>
</head>
<body>
<% User user = (User) session.getAttribute("user"); %>
<h3><%= user.getUserName() %>さんのマイページ</h3>
<table BORDER ="1">

<tr>
<th>備品ID
<th>備品名
<th>返却予定日
<th>返却ボタン
<%
	if(list.size() != 0) {
		for(int i=0; i<list.size(); i++) {
			Bihin bihin = list.get(i);
%>
		<tr>
			<td><%= bihin.getBihinID() %> </td>
			<td><%= bihin.getBihinName() %> </td>
			<td><%= bihin.getReturnDay() %> </td>
			<td> <form method = "POST" action = "ReturnBihinServlet" accept-charset = "UTF-8">
			<input type = "hidden" name = "bihinID" value = "<%= bihin.getBihinName() %>">
			<input type = "submit" value = "返却" > </form>
<%
		}
	}
	else {
		%>
		<td>借りてる備品はありません</td>
		<%
	}
%>

</table>
 <a href="LoginServlet">ログアウト</a>
</body>
</html>