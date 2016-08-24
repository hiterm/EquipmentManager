<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ateam.model.Bihin" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>備品一覧</title>
</head>
<body>
<h3><I><U>備品管理</U></I></h3>
<br>
<h2>備品一覧</h2>

<form>
     ステータス
<select name="status">
<option value="all">全件表示</option>
<option value="success">利用可能</option>
<option value="fail">貸出中</option>
</select>
</form>

<!-- border=1はとりあえず。cssで指定した方がよい -->
<table border=1>
<tr>
<th>備品ID</th><th>備品名</th><th>ステータス</th>
<th>貸出ユーザ名</th><th>返却予定日</th><th>返却</th>
</tr>
<%
List<Bihin> list = (List<Bihin>)request.getAttribute("bihinList");
for (Bihin bihin : list) {
%>
<tr>
<td> <%= bihin.getBihinID() %> </td>
<%-- <td>
<!-- 備品IDをPOSTで渡す -->
<form name="form<%= bihin.getBihinID() %>" method="GET" action="RequestServlet" accept-charset="UTF-8">
<input type="hidden" name="bihinID" value="<%= bihin.getBihinID() %>">
<a href="javascript:document.form<%= bihin.getBihinID() %>.submit()"> <%= bihin.getBihinName() %> </a>
</form>
</td> --%>
<td><%= bihin.getBihinName()  %></td>
<td> <% if(bihin.getStatus() == 1) { %>
<% out.println("利用可能");%>
<% } else {%>
<% out.println("貸出中");%>
<% }%>
</td>
<td> <%= bihin.getUserID() %> </td>
<td> <%= bihin.getReturnDay() %> </td>
<td>
<!-- 返却ボタン -->
<form method="GET" action="RequestServlet" accept-charset="UTF-8">
<input type="hidden" name="bihinID" value="<%= bihin.getBihinID() %>">
<button type="submit" <% if (bihin.getStatus() == 2) {%> disabled <% } %>>
返却
</button>
</form>
</td>
</tr>
<%
}
%>
</table>

</body>
</html>