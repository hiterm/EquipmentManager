package ateam.logic;

import ateam.dao.BihinDAO;
import ateam.model.Bihin;
import ateam.util.LogUtil;

public class ReturnBihinLogic {
   synchronized public static boolean returnBihin(String userID, String bihinID) {
        BihinDAO dao = BihinDAO.getInstance();
        Bihin bihin = dao.getBihin(bihinID);
        if(bihin.getStatus() == Bihin.USED) {
            dao.update(userID, bihinID);
            LogUtil.createLogDate(userID, bihinID);
            return true;
        }
        return false;
    }
}
