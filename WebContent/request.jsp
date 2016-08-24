<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>貸出申請</title>
  </head>
  <body>
  <h3><I><U>備品管理</U></I></h3>
<br>
  <h2>申請ページ</h2>
  <%= request.getAttribute("userName") %>さん
  <br><br><br>
<p></p>
  利用者名:  <%= request.getAttribute ("userName") %><br><br>
  利用者ID:  <%= request.getAttribute ("userID") %><br><br>
    備品名:  <%= request.getAttribute ("bihinName") %><br><br>
    備品ID:  <%= request.getAttribute ("bihinID") %><br><br>
    返却日:
<SELECT name="year">
<option value="">----</option>
<% for(int i=2016; i<2021; i++){%>
<option value="<%= i %>>"><%= i %></option>
<% } %>
</select>
年

<select name="month">
<option value="">--</option>
<% for(int j=1; j<13; j++){%>
<option value="<%= j %>>"><%= j %></option>
<% } %>
</select>
月

<select name="day">
<option value="">--</option>
<% for(int k=1; k<32; k++){%>
<option value="<%= k %>>"><%= k %></option>
<% } %>
</select>
日 <br>
<br>



    <form method="POST" action="" accept-charset="UTF-8">
      <br><br>
      <input type="submit" value="申請">    <a href="BihinListServlet">備品一覧に戻る</a>
    </form>
  </body>
</html>