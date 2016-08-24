package ateam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
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
	public static int doUpdate(String sql) throws SQLException {
		Connection con = null;
		Statement smt = null;

		try {
			con = DBManager.getConnection();
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
	public static <T> T getObject(String sql , ResultSetBeanMapping<T> mapping) throws SQLException {
		Connection con = null;
		Statement smt = null;
		ResultSet rs =null;

		try {
			con = DBManager.getConnection();
			smt = con.createStatement();
			rs = smt.executeQuery(sql);
			if (rs.next()) {
				return (T) mapping.createFromResultSet(rs);
			} else {
				return null;
			}
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
			if (rs != null) {
				try {
					rs.close();
				}
				catch (SQLException ignore) {}
			}
		}
	}
	//検索SQLを発行
	public static <T> List<T> getList(String sql , ResultSetBeanMapping<T> mapping) throws SQLException {
		Connection con = null;
		Statement smt = null;
		ResultSet rs =null;

		try {
			con = DBManager.getConnection();
			smt = con.createStatement();
			rs = smt.executeQuery(sql);

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
			if (rs != null) {
				try {
					rs.close();
				}
				catch (SQLException ignore) {}
			}
		}
	}
}
