<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<FORM method="POST" action="Sample1" accept-charset="UTF-8">
<h1>以下の内容で申請が完了しました</h1>
備品ID:<%= request.getParameter("bihinID")%>><br>
備品名:<%= request.getParameter("bihinName")%>><br>
返却日:<%= request.getParameter("returnDay")%>><br>
</FORM>

</body>
</html>