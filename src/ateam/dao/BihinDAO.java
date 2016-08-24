package ateam.dao;

import java.sql.SQLException;
import java.util.List;

import ateam.model.Bihin;

public class BihinDAO {
	//全件操作
	public List<Bihin> getBihinList() {
		String sql = "SELECT * FROM BihinKanri ";

		try {
			return DBManager.simpleFind(sql,new BihinBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	//自身の借りているものを表示
	public List<Bihin> getBihinList(String userID) {
		String sql = "SELECT * FROM BihinKanri WHERE userID = "+"'"+userID+"'";

		try {
			return DBManager.simpleFind(sql,new BihinBeansMapping());
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
	//ステータス変更
	public int update(String numb) {
		String sql = "UPDATE BihinKanri SET status = 1 WHERE id = ";
		try {
			return DBManager.simpleUpdate(sql+numb);
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}
