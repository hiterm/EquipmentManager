<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.io.*,java.util.*,java.text.*, ateam.model.Bihin, ateam.model.User"%>
<%
    List<Bihin> list = (List<Bihin>) request.getAttribute("list");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
<title>マイページ</title>
</head>

<body>
	<div class="pure-menu pure-menu-horizontal">
		<a href="#" class="pure-menu-heading pure-menu-link">Equipment Manager</a>
		<ul class="pure-menu-list">
			<li class="pure-menu-item"><a href="MyPageServlet"
				class="pure-menu-link">マイページ</a></li>
			<li class="pure-menu-item"><a href="BihinListServlet"
				class="pure-menu-link">備品一覧</a></li>
			<li class="pure-menu-item"><a href="LogoutServlet"
				class="pure-menu-link">ログアウト</a></li>
		</ul>
	</div>
	<%
	    User user = (User) session.getAttribute("user");
	%>
	<h1><%=user.getUserName()%>さんのマイページ
	</h1>

	<h3>借りている備品一覧</h3>
	<%
	    if (list.size() != 0) {
	        for (int i = 0; i < list.size(); i++) {
	            Bihin bihin = list.get(i);
	%>
	<table class="pure-table pure-table-bordered">

		<thead>
			<tr>
				<th>備品ID</th>
				<th>備品名</th>
				<th>返却予定日</th>
				<th>返却ボタン</th>
		</thead>

		<tbody>
		<tr>
			<td><%=bihin.getBihinID()%></td>
			<td><%=bihin.getBihinName()%></td>
			<td><%=bihin.getReturnDay()%></td>
			<td>
				<form method="POST" action="ReturnBihinServlet"
					accept-charset="UTF-8">
					<input type="hidden" name="bihinID"
						value="<%=bihin.getBihinName()%>">
						<button type="submit" class="pure-button">返却</button>
				</form> <%
     }
     } else {
 %>
				<table>現在借りてる備品はありません
				</table> <%
     }
 %>

	</table>
</body>
</html>