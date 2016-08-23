<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.text.*, ateam.model.Bihin" %>
<% List<Bihin> list = (List<Bihin>)request.getAttribute("list"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マイページ</title>
</head>
<body>
<table BORDER ="1">

<tr>
<th>備品ID
<th>備品名
<th>備品名（フリガナ）
<th>ステータス
<th>貸出ユーザID
<th>返却予定日
<th>返却ボタン
<%
	for(int i=0; i<list.size(); i++) {
		Bihin bihin = list.get(i);
%>
	<tr>
		<td><%= bihin.getBihinID() %> </td>
		<td><%= bihin.getBihinName() %> </td>
		<td><%= bihin.getBihinKana() %> </td>
		<td><%= bihin.getStatus() %> </td>
		<td><%= bihin.getUserID() %> </td>
		<td><%= bihin.getReturnDay() %> </td>
		<td> <form method = "POST" action = "StatusChangeReturnServlet" accept-charset = "UTF-8">
		<input type = "hidden" name = "bihinID" value = "<%= bihin.getBihinName() %>">
		<input type = "submit" value = "返却" > </form>
<%
	}
%>

</table>

<a href="topPage.jsp">トップページに戻る</a>
</body>
</html>