<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>貸出申請</title>
  </head>
  <body>
  <br><br><br>
<p></p>
  備品名: <%= request.getParameter("bihinName") %>

    <FORM method="POST" action="">
      <BR><BR>
      <INPUT TYPE="submit" value="申請">
      <INPUT TYPE="submit" value="返却">
    </FORM>
  </body>
</html>