package ateam.logic;

public class LoginLogic {
		public static int myUser(String id , String pass) {
			ateam.dao.sample_DAO dao = new ateam.dao.sample_DAO();
			int cnt = dao.canLogin(id , pass);

			return cnt;
		}

}
