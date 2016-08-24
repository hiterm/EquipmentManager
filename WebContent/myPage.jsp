<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.text.*, ateam.model.Bihin, ateam.model.User" %>
<% List<Bihin> list = (List<Bihin>)request.getAttribute("list"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マイページ</title>
<style type="text/css">
h4 {
   color: red;} /* 見出しの色 */
</style>
</head>
<body>
<h4><I><U>備品管理</U></I></h4>
<br>
<% User user = (User) session.getAttribute("user"); %>
<h3><%= user.getUserName() %>さんのマイページ</h3>
<%
	if(list.size() == 0) {
		for(int i=0; i<list.size(); i++) {
			Bihin bihin = list.get(i);
%>
<table BORDER ="1">

<tr>
<th>備品ID
<th>備品名
<th>返却予定日
<th>返却ボタン

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
		<table>
		現在借りてる備品はありません
		</table>
		<%
	}
%>

</table>
 <a href="LogoutServlet">ログアウト</a>
 <br>
 <a href = "BihinListServlet">備品一覧へ（貸出はこちらから）</a>
</body>
</html>