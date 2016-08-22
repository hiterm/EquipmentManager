package ateam.logic;

public class LoginLogic {

	public static boolean login(String userID, String password){
		if(userID.equals("root") && password.equals("root") ){
			return true;
		}
		return false;

	}

}
