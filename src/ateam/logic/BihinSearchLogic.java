package ateam.logic;

import java.util.List;

import ateam.dao.BihinDAO;
import ateam.model.Bihin;

public class BihinSearchLogic {
    public static List<Bihin> getBihinSearchList(int status) {
        BihinDAO dao = BihinDAO.getInstance();
        List<Bihin> list = dao.searchBihin(status);
        return list;
    }

    public static List<Bihin> getBihinSearchList(String bihinKana ,String bihinName, int status){
        BihinDAO dao = BihinDAO.getInstance();
        List<Bihin> list = dao.searchBihin(bihinKana ,bihinName,status);
        return list;
    }

    public static List<Bihin> getBihinSeachList(String bihinKana,String bihinName){
        BihinDAO dao = BihinDAO.getInstance();
        List<Bihin> list = dao.searchBihin(bihinKana,bihinName);
        return list;
    }



    public static int getStatusSearch(String statusName){
        int status;
        switch (statusName) {
        case "success":
            status = 1;
            break;
        case "fail":
            status = 2;
            break;
        default:
            status = 0;
            break;
        }
        return status;
    }


}
