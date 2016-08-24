package ateam.dao;

import java.sql.SQLException;

import ateam.model.User;

public class UserDAO {
	//ログイン判定
	public User getUser(String userID , String pass) {
		String sql = "SELECT *  FROM UserKanri WHERE userID = '" + userID +"';";
		try {
			return DBManager.getObject(sql , new UserBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}
