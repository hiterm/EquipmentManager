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
    返却日:
<SELECT name="year">
<option value="">----</option>
<option value="2016">2016</option>
<option value="2017">2017</option>
<option value="2018">2018</option>
<option value="2019">2019</option>
<option value="2020">2020</option>
</select>
年
<SELECT name="month">
<option value="">--</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
</SELECT>
月
<SELECT name="day">
<option value="">--</option>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select>
日 <br>
<br>



    <FORM method="POST" action="" accept-charset="UTF-8">
      <BR><BR>
      <input type="submit" value="申請">    <a href="BihinListServlet">備品一覧に戻る</a>
    </FORM>
  </body>
</html>