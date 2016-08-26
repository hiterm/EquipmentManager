<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<% String errorMessage = (String) request.getAttribute("errorMessage");%>

<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ログイン</title>
    <link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.6.0/pure-min.css">

  </head>
  <body>
<h4><I><U>EquipmentManager</U></I></h4>
<br>

<h2>ログイン</h2>

    <% if(errorMessage != null){ %>
    <font color="red"><% out.println(errorMessage);%></font>
    <% }%>
    <br>

   <!-- <style scoped>
    body{
    background-color: #FFF5EE;
    }
    </style>
    <!--背景色の変更-->

  <form method="POST" action="LoginServlet" accept-charset="UTF-8" class="pure-form pure-form-aligned">
    <fieldset>
    <div class="pure-control-group">
        <label for="userID">ユーザーID</label>
        <input name="userID" id="userID" type="text">
    </div>
<br><br>
    <div class="pure-control-group">
            <label for="password">パスワード</label>
            <input name="password" id="password" type="password">
    </div>

    <div class="pure-controls">
    &nbsp;
        <button type="submit" class="pure-button pure-button-primary">送信</button>
    &nbsp;&nbsp;
        <button type="reset" class="pure-button pure-button-primary">リセット</button>
    </div>
    </fieldset>
        <style scoped>
.pure-button-primary {
	background: #A9A9A9;
}
        </style>
 </form>
  </body>
</html>