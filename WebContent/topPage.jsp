<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>トップページ</title>
  </head>
  <body>
    <h1>トップページ</h1>
    <p><%= request.getAttribute("userName") %> /> さんの備品管理</p>

	<ul>
    <li><a href="BihinListServlet">備品一覧</a><br></li>
    <li><a href="StateDisplayServlet">マイページ</a><br></li>
    </ul>

  </body>
</html>