package ateam.dao;

import java.sql.SQLException;
import java.util.List;

import ateam.model.Bihin;
import ateam.model.User;

public class sample_DAO {
	//全件操作
	public List<Bihin> findAll() {
		String sql = "SELECT * FROM BihinKanri ";

		try {
			return DBManager3.simpleFind(sql,new BihinBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	//自身の借りているものを表示
	public List<Bihin> myFindAll(String userID) {
		String sql = "SELECT * FROM BihinKanri WHERE userID = "+"'"+userID+"'";

		try {
			return DBManager3.simpleFind(sql,new BihinBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
	//ログイン判定
	public List<User> canLogin(String userID , String pass) {
		String sql = "SELECT COUNT(*) AS CNT , password FROM UserKanri WHERE userID = '" + userID +"', password = '"+pass+"'";

		try {
			return DBManager3.simpleFind(sql,new UserBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	//ステータス変更
	public int update(String numb) {
		String sql = "UPDATE BihinKanri SET status = 1 WHERE id = ";
		try {
			return DBManager3.simpleUpdate(sql+numb);
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}
