<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>貸出申請</title>
  </head>
  <body>
  <h1>申請ページ</h1>
  <%= request.getAttribute("userName") %>さん
  <br><br><br>
<p></p>
  利用者名:  <%= request.getAttribute ("userName") %><br><br>
  利用者ID:  <%= request.getAttribute ("userID") %><br><br>
    備品名:  <%= request.getAttribute ("bihinName") %><br><br>
    備品ID:  <%= request.getAttribute ("bihinID") %><br><br>
    返却日:  <input type="text" name="returnDay" ><br><br>


    <FORM method="POST" action="" accept-charset="UTF-8">
      <BR><BR>
      <input type="submit" value="申請">    <a href="BihinListServlet">備品一覧に戻る</a>
    </FORM>
  </body>
</html>