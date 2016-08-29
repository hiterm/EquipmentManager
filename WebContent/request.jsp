<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="java.io.*,java.util.*,java.text.*, ateam.model.Bihin, ateam.model.User"%>

<% String errorMessage = (String) request.getAttribute("errorMessage");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">

<!-- jquery -->
<link rel="stylesheet"
	href="http://ajax.googleapis.com/ajax/libs/jqueryui/1/themes/flick/jquery-ui.min.css">
<script type="text/javascript" src="js/jquery-3.1.0.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/jquery.ui.datepicker-ja.min.js"></script>


<script>
	$(function() {
		var dateFormat = 'yy-mm-dd';
		$("#datepicker").datepicker({
			dateFormat : dateFormat,
			minDate : 0
		});
	});
</script>

<title>貸出申請</title>

</head>
<body>
	<%@ include file="menu.jsp"%>
	<!-- <style scoped>
    body{
    background-color: #FFF0F5;
    }
    </style>
    <!--背景色の変更-->

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
	<% if(errorMessage != null){ %>
	<font color="red">
		<% out.println(errorMessage);%>
	</font>
	<% }%>
	<br>
	<form method="POST" name="requestForm" action="RequestChoiceServlet"
		onsubmit="return submitChk()" accept-charset="UTF-8">
		返却日：<input type="text" name="returnDate" id="datepicker" readonly="readonly"> <input
			type="hidden" name="bihinID"
			value="<%=request.getAttribute("bihinID")%>"> <input
			type="hidden" name="bihinName"
			value="<%=request.getAttribute("bihinName")%>">

		<script>
			/**
			 * 確認ダイアログの返り値によりフォーム送信
			 */
			function submitChk() {
				if (document.requestForm.returnDate.value == "") {
					window.alert("返却日を入力してください");
					return false;
				}
				/* 確認ダイアログ表示 */
				var flag = confirm("申請してもよろしいですか？\n\n申請したくない場合は[キャンセル]ボタンを押して下さい");
				/* send_flg が TRUEなら送信、FALSEなら送信しない */
				return flag;
			}
		</script>
		<br>
		<button type="submit" class="pure-button">申請</button>

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

</body>
</html>