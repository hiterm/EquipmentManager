<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="ateam.model.Bihin"%>
<%@ page import="java.util.List"%>
<%@ page import="ateam.util.BihinUtil"%>
<%@ page import="ateam.util.UserUtil"%>
<%
    List<Bihin> list = (List<Bihin>) request.getAttribute("bihinList");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>備品一覧</title>
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
<style type="text/css">
h4 {
	color: red;
} /* 見出しの色 */
</style>

</head>
<body>
	<%@ include file="menu.jsp"%>
	<br>
	<h2>備品一覧</h2>


	<!-- ステータスの絞り込み -->
	<form method="POST" action="BihinSearchServlet" accept-charset="UTF-8">
		ステータス <select name="status">
			<option value="all">全件表示</option>
			<option value="success">利用可能</option>
			<option value="fail">貸出中</option>
		</select>

		<!-- 備品検索フォーム -->
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;備品検索 <input type="search"
			name="search" maxlength="10">
		<button type="submit" class="pure-button">検索</button>
	</form>




	<!-- border=1はとりあえず。cssで指定した方がよい -->
	<table class="pure-table pure-table-striped" border=1>
		<thead>
			<tr>
				<th>備品ID</th>
				<th>備品名</th>
				<th>ステータス</th>
				<th>貸出ユーザ名</th>
				<th>返却予定日</th>
				<th>申請</th>
			</tr>
		</thead>
		<tbody>
			<%
			    for (Bihin bihin : list) {
			%>
			<tr>
				<td><%=bihin.getBihinID()%></td>
				<td><%=bihin.getBihinName()%></td>

				<!-- ステータス 1:利用可能 2:貸出中 3:返却済み 4:貸出申請中-->
				<td>
					<%
					    out.println(BihinUtil.getStatusStr(bihin.getStatus()));
					%>
				</td>

				<!-- ユーザー名がなかったら---を表示 -->
				<td>
					<%
					    out.println(UserUtil.getUserName(bihin.getUserID()));
					%>
				</td>

				<!-- 返却日がなかったら---を表示 -->
				<td>
					<%
					    if (bihin.getReturnDay() != null) {
					%> <%
     out.println(bihin.getReturnDay());
 %>
					<%
					    } else {
					%> <%
     out.println("---");
 %> <%
     }
 %>
				</td>
				<td>
					<!-- 申請ボタン -->
					<form method="POST" action="RequestServlet" accept-charset="UTF-8">
						<input type="hidden" name="bihinName"
							value="<%=bihin.getBihinName()%>">
						<button type="submit" class="pure-button"
							<% if (bihin.getStatus() == 2) {%> disabled <% } %>>申請</button>
					</form>
				</td>
			</tr>
			<%
}
%>
		</tbody>
	</table>

</body>
</html>