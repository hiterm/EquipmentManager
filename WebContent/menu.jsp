<%@ page pageEncoding="UTF-8" %>
<div class="pure-menu pure-menu-horizontal">
    <style scoped>

        .pure-menu-item {
            color: white;
            border-radius: 10px;
            text-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
        }

        .pure-menu-item {
            background: rgb(180,180,180); /* この背景色を紺色に。 */
        }

    </style>
	<a href="#" class="pure-menu-heading pure-menu-link"><I><U>EquipmentManager</U></I></a>
	<ul class="pure-menu-list">
		<li class="pure-menu-item"><a href="MyPageServlet"
			class="pure-menu-link">マイページ</a></li>
		<li class="pure-menu-item"><a href="BihinListServlet"
			class="pure-menu-link">備品一覧</a></li>
		<li class="pure-menu-item"><a href="LogoutServlet"
			class="pure-menu-link">ログアウト</a></li>
	</ul>
</div>