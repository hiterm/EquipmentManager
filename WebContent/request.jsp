<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>貸出申請</title>
  </head>
  <body>
  <h1>選択した備品の確認</h1>
  <br><br><br>
<p></p>
  選択した備品: <%= request.getParameter("bihinName") %>

    <FORM method="POST" action="" accept-charset="UTF-8">
      <BR><BR>
      <INPUT TYPE="submit" value="申請">
      <INPUT TYPE="submit" value="返却">
    </FORM>
  </body>
</html>