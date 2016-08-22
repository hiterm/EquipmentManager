<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>トップページ</title>
  </head>
  <body>

    <h1>トップページ</h1>
    <p><%= request.getParameter("userName") %> /> さんの備品管理</p>

    <a href=".jsp">・備品一覧</a><br>
    <a href=".jsp">・現在の状況</a><br>
    <a href=".jsp">・</a><br>

  </body>
</html>