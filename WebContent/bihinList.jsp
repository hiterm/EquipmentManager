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

</head>
<body>
	<%@ include file="menu.jsp"%>
	<br>
	<h2>備品一覧</h2>

	<% // 前の入力状況を取得しておく
String prevBihinKana = (String) request.getAttribute("bihinKana");
String prevStatusName = (String) request.getAttribute("statusName"); %>

	<fieldset>
		<legend>詳細検索</legend>
		<!-- ステータスの絞り込み -->
		<form method="POST" action="BihinSearchServlet" accept-charset="UTF-8"
			class="pure-form pure-form-stacked">
			<div class="pure-u-1-3 pure-u-md-1-3">
				<label for="status">ステータス</label> <select name="status"
					class="pure-input-1-2">
					<% // 前に選択されたところを選択する
					if (prevStatusName == null) { %>
						<option value="all">全件表示</option>
						<option value="success">利用可能</option>
						<option value="fail">貸出中</option>
					<% } else if ("all".equals(prevStatusName)) { %>
							<option value="all" selected>全件表示</option>
							<option value="success">利用可能</option>
							<option value="fail">貸出中</option>
					<% } else if ("success".equals(prevStatusName)) {%>
							<option value="all">全件表示</option>
							<option value="success" selected>利用可能</option>
							<option value="fail">貸出中</option>
					<% } else if ("fail".equals(prevStatusName)) {%>
							<option value="all">全件表示</option>
							<option value="success">利用可能</option>
							<option value="fail" selected>貸出中</option>
					<% } else {%>
							<option value="all">全件表示</option>
							<option value="success">利用可能</option>
							<option value="fail">貸出中</option>
					<% } %>
				</select>
			</div>
			<br>
			<style scoped>
.pure-button {
	font-size: 100%;
}

.margin {
    border:solid 1px #FFFFFF;margin:10px;
}

</style>

			<div class="pure-u-1-3 pure-u-md-1-3">
				<!-- 備品検索フォーム -->
				<!-- 前に入力された文字を保持する -->
				備品名(カナ) <input type="search" class="pure-u-23-24" name="search"
					maxlength="10" <% if (prevBihinKana != null) { %>
					value="<%= prevBihinKana %>" <% } %>>
				<!--inputここまで -->
			</div>
			<br>
			<button type="submit" class="pure-button">検索</button>
	</fieldset>
	</form>

	<div class="margin">
	<table class="pure-table pure-table-striped" align="center">
	<%
	    if (list.size() != 0) {
	%>
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
					    out.println(BihinUtil.getReturnDayStr(bihin.getReturnDay()));
					%>
				</td>
				<td>
					<!-- 申請ボタン -->
					<form method="POST" action="RequestServlet" accept-charset="UTF-8">
						<input type="hidden" name="bihinName"
							value="<%=bihin.getBihinName()%>"> <input type="hidden"
							name="bihinID" value="<%=bihin.getBihinID()%>">
						<button type="submit" class="pure-button"
							<%if (bihin.getStatus() == 2) {%> disabled <%}%>>申請</button>
					</form>
				</td>
			</tr>
			<%
			    }
			%>
		</tbody>
	</table>
	</div>

	<%
	} else {
%>
		<center>
		<font size="5">検索結果はありません</font>
		</center>
<%
	}
%>

</body>
</html>