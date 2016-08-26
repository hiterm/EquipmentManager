package ateam.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBManager {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // MySQLに接続
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bihin", "root", "Ateam");
            return con;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    //更新SQLを発行(パラメータ文字列２つ)
    public static int doUpdate(String sql, String pmt1, String pmt2) throws SQLException {
        Connection con = null;
        PreparedStatement smt = null;

        try {
            con = DBManager.getConnection();
            smt = con.prepareStatement(sql);
            smt.setString(1, pmt1);
            smt.setString(2, pmt2);
            return smt.executeUpdate();
        } finally {
            if (smt != null) {
                try {
                    smt.close();
                } catch (SQLException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    //更新SQLを発行(パラメータ文字列2つデータ1つ)
    public static int doUpdate(String sql, String pmt1, Date pmt2, String pmt3) throws SQLException {
        Connection con = null;
        PreparedStatement smt = null;

        try {
            con = DBManager.getConnection();
            smt = con.prepareStatement(sql);
            smt.setString(1, pmt1);
            smt.setDate(2, pmt2);
            smt.setString(3, pmt3);
            return smt.executeUpdate();
        } finally {
            if (smt != null) {
                try {
                    smt.close();
                } catch (SQLException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    public static <T> T getObject(String sql, String pmt, ResultSetBeanMapping<T> mapping) throws SQLException {
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement smt = null;
        try {
            con = DBManager.getConnection();
            smt = con.prepareStatement(sql);
            smt.setString(1, pmt);
            rs = smt.executeQuery();
            if (rs.next()) {
                return (T) mapping.createFromResultSet(rs);
            } else {
                return null;
            }
        } finally {
            if (smt != null) {
                try {
                    smt.close();
                } catch (SQLException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    //検索SQLを発行
    public static <T> List<T> getList(String sql, ResultSetBeanMapping<T> mapping) throws SQLException {
        Connection con = null;
        Statement smt = null;
        ResultSet rs = null;

        try {
            con = DBManager.getConnection();
            smt = con.createStatement();
            rs = smt.executeQuery(sql);

            List<T> list = new ArrayList<T>();
            while (rs.next()) {
                T bean = mapping.createFromResultSet(rs);
                list.add(bean);
            }

            return list;
        } finally {
            if (smt != null) {
                try {
                    smt.close();
                } catch (SQLException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    //検索発行（パラメータ2つ）
    public static <T> List<T> getSearchList(String sql, String pmt1, String pmt2, ResultSetBeanMapping<T> mapping)
            throws SQLException {
        Connection con = null;
        PreparedStatement smt = null;
        ResultSet rs = null;

        try {
            con = DBManager.getConnection();
            smt = con.prepareStatement(sql);
            smt.setString(1, "%" + pmt1 + "%");
            smt.setString(2, "%" + pmt2 + "%");
            rs = smt.executeQuery();

            List<T> list = new ArrayList<T>();
            while (rs.next()) {
                T bean = mapping.createFromResultSet(rs);
                list.add(bean);
            }

            return list;
        } finally {
            if (smt != null) {
                try {
                    smt.close();
                } catch (SQLException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    //検索発行（マイページ）
    public static <T> List<T> getList(String sql, String pmt, ResultSetBeanMapping<T> mapping) throws SQLException {
        Connection con = null;
        PreparedStatement smt = null;
        ResultSet rs = null;

        try {
            con = DBManager.getConnection();
            smt = con.prepareStatement(sql);
            smt.setString(1, pmt);
            rs = smt.executeQuery();

            List<T> list = new ArrayList<T>();
            while (rs.next()) {
                T bean = mapping.createFromResultSet(rs);
                list.add(bean);
            }

            return list;
        } finally {
            if (smt != null) {
                try {
                    smt.close();
                } catch (SQLException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }

    //検索発行（パラメータ１つ）
    public static <T> List<T> getSearchList(String sql, int pmt, ResultSetBeanMapping<T> mapping) throws SQLException {
        Connection con = null;
        PreparedStatement smt = null;
        ResultSet rs = null;

        try {
            con = DBManager.getConnection();
            smt = con.prepareStatement(sql);
            smt.setInt(1, pmt);
            rs = smt.executeQuery();

            List<T> list = new ArrayList<T>();
            while (rs.next()) {
                T bean = mapping.createFromResultSet(rs);
                list.add(bean);
            }

            return list;
        } finally {
            if (smt != null) {
                try {
                    smt.close();
                } catch (SQLException ignore) {
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ignore) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignore) {
                }
            }
        }
    }
}
