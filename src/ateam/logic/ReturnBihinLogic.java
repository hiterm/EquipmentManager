package ateam.logic;

import ateam.dao.BihinDAO;

public class ReturnBihinLogic {
    public static void returnBihin(String userID, String bihinID) {
        BihinDAO dao = BihinDAO.getInstance();
        dao.update(userID, bihinID);
    }
}
