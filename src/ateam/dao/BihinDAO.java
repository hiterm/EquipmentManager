package ateam.dao;

import java.sql.SQLException;
import java.util.List;

import ateam.model.Bihin;

public class BihinDAO {
	private static BihinDAO instance = new BihinDAO();
	private static BihinBeansMapping mapping = new BihinBeansMapping();

	private BihinDAO() {}

	public static BihinDAO getInstance() {
		return instance;
	}

	//全件操作
	public List<Bihin> getBihinList() {
		String sql = "SELECT * FROM BihinKanri ";

		try {
			return DBManager.getList(sql, mapping);
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}

	//自身の借りているものを表示
	public List<Bihin> getBihinList(String userID) {
		String sql = "SELECT * FROM BihinKanri WHERE userID = "+"'"+userID+"'";

		try {
			return DBManager.getList(sql, mapping);
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
	//ステータス変更
	public int update(String numb) {
		String sql = "UPDATE BihinKanri SET status = 1 userID = NULL returnDay = NULL WHERE id = ";
		try {
			return DBManager.doUpdate(sql+numb);
		}
		catch (SQLException e) {
			throw new IllegalStateException(e);
		}
	}
}
