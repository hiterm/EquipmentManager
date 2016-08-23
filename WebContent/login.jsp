<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<% String errorMessage = (String) request.getAttribute("errorMessage");%>

<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ログイン</title>
  </head>
  <body>
    <h1>ログイン</h1>

    <% if(errorMessage != null){ %>
    <% out.println(errorMessage);%>
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