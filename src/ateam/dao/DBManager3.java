package ateam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager3 {
	public static Connection getConnection() {
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
            // MySQLに接続
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bihin", "root", "Ateam");
			return con;
		}
		catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	//更新SQLを発行
	public static int simpleUpdate(String sql) throws SQLException {
		Connection con = null;
		Statement smt = null;

		try {
			con = DBManager3.getConnection();
			smt = con.createStatement();
			return smt.executeUpdate(sql);
		}
		finally {
			if (smt != null) {
				try {
					smt.close();
				}
				catch(SQLException ignore) {}
			}
			if (con != null) {
				try {
					con.close();
				}
				catch (SQLException ignore) {}
			}
		}
	}

	//Login発行
	public static int simpleLogin(String sql) throws SQLException {
		Connection con = null;
		Statement smt = null;

		try {
			int cnt = 0;
			con = DBManager3.getConnection();
			smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				cnt = rs.getInt("CNT");
			}
			return cnt;
		}
		finally {
			if (smt != null) {
				try {
					smt.close();
				}
				catch(SQLException ignore) {}
			}
			if (con != null) {
				try {
					con.close();
				}
				catch (SQLException ignore) {}
			}
		}
	}
	//検索SQLを発行
	public static <T> List<T> simpleFind(String sql , ResultSetBeanMapping<T> mapping) throws SQLException {
		Connection con = null;
		Statement smt = null;

		try {
			con = DBManager3.getConnection();
			smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);

			List<T> list = new ArrayList<T>();
			while(rs.next()) {
				T bean = mapping.createFromResultSet(rs);
				list.add(bean);
			}

			return list;
		}
		finally {
			if (smt != null) {
				try {
					smt.close();
				}
				catch (SQLException ignore) {}
			}
			if (con != null) {
				try {
					con.close();
				}
				catch (SQLException ignore) {}
			}
		}
	}
}
