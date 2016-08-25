package ateam.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import ateam.model.Bihin;

public class BihinDAO {
    private static BihinDAO instance = new BihinDAO();
    private static BihinBeansMapping mapping = new BihinBeansMapping();

    private BihinDAO() {
    }

    public static BihinDAO getInstance() {
        return instance;
    }

    //全件操作
    public List<Bihin> getBihinList() {
        String sql = "SELECT * FROM BihinKanri ORDER BY 'ASC' ";

        try {
            return DBManager.getList(sql, mapping);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    //自身の借りているものを表示
    public List<Bihin> getBihinList(String userID) {
        String sql = "SELECT * FROM BihinKanri WHERE userID = " + "'" + userID + "' ORDER BY 'ASC' ";

        try {
            return DBManager.getList(sql, mapping);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }

    //ステータス変更(返却)
    public int update(String userID , String bihinID) {
        String sql = "UPDATE BihinKanri SET status = 1 ,userID = NULL , returnDay =  NULL WHERE userID = '" + userID + "' and bihinID = '"+bihinID+"'";
        try {
            return DBManager.doUpdate(sql);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
    //ステータス変更(貸出)
    public int update(String bihinID , String userID , Date returnDay) {
        String sql = "UPDATE BihinKanri SET status = 2 ,userID = '" + userID + "' , returnDay =  '"+ returnDay + "' WHERE bihinID = '" + bihinID + "'";
        try {
            return DBManager.doUpdate(sql);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
    //一行の情報を取得
    public Bihin getBihin(String bihinID) {
        String sql = "SELECT *  FROM BihinKanri WHERE bihinID = '" + bihinID + "';";
        try {
            return DBManager.getObject(sql, mapping);
        } catch (SQLException e) {
            throw new IllegalStateException(e);
        }
    }
}
