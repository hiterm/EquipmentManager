<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<% String errorMessage = (String) request.getAttribute("errorMessage");%>

<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ログイン</title>
    <style type="text/css">
h4 {
   color: red;} /* 見出しの色 */
</style>

  </head>
  <body>
<h4><I><U>備品管理</U></I></h4>
<br>
   <h2>ログイン</h2>


    <% if(errorMessage != null){ %>
    <font color="red"><% out.println(errorMessage);%></font>
    <% }%>
    <br>
    <br>

      <form method="POST" action="LoginServlet" accept-charset="UTF-8">
      ユーザーID : <input type="text" name="userID"><br><br>
      パスワード : <input type="password" name="password"><br><br>
      <input type="submit" value="送信">
      <input type="reset" value="リセット">
    </form>
  </body>
</html>