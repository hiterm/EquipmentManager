<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.io.*,java.util.*,java.text.*, ateam.model.Bihin, ateam.model.User"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>貸出申請</title>
<style type="text/css">
h4 {
	color: red;
} /* 見出しの色 */
</style>
<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">
</head>
<body>
	<h4>
		<I><U>備品管理</U></I>
	</h4>
	<%
	    User user = (User) session.getAttribute("user");
	%>

	<br>
	<h2>申請ページ</h2>
	<%=user.getUserName()%>さん
	<br>
	<br>
	<br> 利用者名:
	<%=user.getUserName()%><br>
	<br> 利用者ID:
	<%=user.getUserID()%><br>
	<br>
	<%
	    request.setCharacterEncoding("UTF-8");
	%>
	備品名:
	<%=request.getAttribute("bihinName")%><br>
	<br>
	<form method="POST" action="RequestChoiceServlet"
		accept-charset="UTF-8">
		返却日: <SELECT name="year">
			<option value="">----</option>
			<%
			    for (int i = 2016; i < 2021; i++) {
			%>
			<option value="<%=i%>"><%=i%></option>
			<%
			    }
			%>
		</select> 年 <select name="month">
			<option value="">--</option>
			<%
			    for (int j = 1; j < 13; j++) {
			%>
			<option value="<%=j%>"><%=j%></option>
			<%
			    }
			%>
		</select> 月 <select name="day">
			<option value="">--</option>
			<%
			    for (int k = 1; k < 32; k++) {
			%>
			<option value="<%=k%>"><%=k%></option>
			<%
			    }
			%>
		</select> 日 <br> <br> <br>
		<input type="hidden" name="bihinID" value="<%= request.getAttribute("bihinID") %>">
		<input type="hidden" name="bihinName" value="<%= request.getAttribute("bihinName") %>">
		<br> <button type="submit">申請</button>
	</form>

<%-- <form class="pure-form pure-form-aligned">
    <fieldset>
        <div class="pure-control-group">
            <label for="userName">利用者名</label>
            <input id="userName" type="text">
        </div>

        <div class="pure-control-group">
            <label for="userID">ユーザーID</label>
            <input id="userID" type="text">
        </div>

        <div class="pure-control-group">
            <label for="bihinName">備品名</label>
            <input id="email" type="text">
        </div>

        <div class="pure-control-group">
            <label for="email">備品ID</label>
            <input id="email" type="email">
        </div>

        <div class="pure-control-group">
            <label for="email">返却日</label>
            <SELECT name="year">
			<option value="">----</option>
			<%
			    for (int i = 2016; i < 2021; i++) {
			%>
			<option value="<%=i%>"><%=i%></option>
			<%
			    }
			%>
		</select> 年 <select name="month">
			<option value="">--</option>
			<%
			    for (int j = 1; j < 13; j++) {
			%>
			<option value="<%=j%>"><%=j%></option>
			<%
			    }
			%>
		</select> 月 <select name="day">
			<option value="">--</option>
			<%
			    for (int k = 1; k < 32; k++) {
			%>
			<option value="<%=k%>"><%=k%></option>
			<%
			    }
			%>
		</select> 日
        </div>

        <div class="pure-controls">
            <button type="submit" class="pure-button pure-button-primary">申請</button>
        </div>
    </fieldset>
</form> --%>

	<a href="BihinListServlet">備品一覧に戻る</a>
</body>
</html>