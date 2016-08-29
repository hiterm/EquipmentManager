package ateam.logic;

import java.sql.Date;

import ateam.dao.BihinDAO;
import ateam.model.Bihin;
import ateam.util.LogUtil;

public class RequestLogic {
    synchronized public static boolean requestBihin(String bihinID, String userID, Date returnDay) {
        BihinDAO dao = BihinDAO.getInstance();
        Bihin bihin = dao.getBihin(bihinID);
        if (bihin.getStatus() == 1) {
            dao.update(bihinID, userID, returnDay);
            LogUtil.createLogDate(userID, bihinID);
            //ステータスが貸出可の場合にのみtureを返す
            return true;
        }
        return false;
    }
}