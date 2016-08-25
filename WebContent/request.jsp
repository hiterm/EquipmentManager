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
			<option value="<%=i%>>"><%=i%></option>
			<%
			    }
			%>
		</select> 年 <select name="month">
			<option value="">--</option>
			<%
			    for (int j = 1; j < 13; j++) {
			%>
			<option value="<%=j%>>"><%=j%></option>
			<%
			    }
			%>
		</select> 月 <select name="day">
			<option value="">--</option>
			<%
			    for (int k = 1; k < 32; k++) {
			%>
			<option value="<%=k%>>"><%=k%></option>
			<%
			    }
			%>
		</select> 日 <br> <br> <br>
		<br> <input type="submit" value="申請">
	</form>
	<a href="BihinListServlet">備品一覧に戻る</a>
</body>
</html>