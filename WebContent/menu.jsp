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
		<li class="pure-menu-item"><a href="LogoutServlet" onclick="return clickChk()"
			class="pure-menu-link">
			<script>
			/**
			 * 確認ダイアログの返り値によりフォーム送信
			 */
			function clickChk() {
				/* 確認ダイアログ表示 */
				var flag = confirm("ログアウトしてもよろしいですか？\n\nログアウトしたくない場合は[キャンセル]ボタンを押して下さい");
				/* send_flg が TRUEなら送信、FALSEなら送信しない */
				return flag;
			}
		</script>ログアウト</a></li>
	</ul>
</div>