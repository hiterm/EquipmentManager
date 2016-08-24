package ateam.logic;

import ateam.dao.BihinDAO;
import ateam.model.Bihin;

public class RequestLogic {
    public static boolean requestBihin(String bihinID) {
        BihinDAO dao = BihinDAO.getInstance();
        Bihin bihin = dao.getBihin(bihinID);
        	if(bihin.getStatus() == 1) {
        		//ステータスが貸出可の場合にのみtureを返す
        		return true;
        	}
        return true;
    }
}