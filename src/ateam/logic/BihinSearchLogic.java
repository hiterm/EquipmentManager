package ateam.logic;

import java.util.List;

import ateam.dao.BihinDAO;
import ateam.model.Bihin;
import ateam.util.StringUtil;

public class BihinSearchLogic {
    public static List<Bihin> getBihinSearchList(int status) {
        BihinDAO dao = BihinDAO.getInstance();
        List<Bihin> list = dao.searchBihin(status);
        return list;
    }

    public static List<Bihin> getBihinSearchList(String bihinKana, String bihinName, int status) {
        BihinDAO dao = BihinDAO.getInstance();
        String katakanaBihinKana = StringUtil.convertHiraganaToKatakana(bihinKana);
        List<Bihin> list = dao.searchBihin(katakanaBihinKana, bihinName, status);
        return list;
    }

    public static List<Bihin> getBihinSeachList(String bihinKana, String bihinName) {
        BihinDAO dao = BihinDAO.getInstance();
        String katakanaBihinKana = StringUtil.convertHiraganaToKatakana(bihinKana);
        List<Bihin> list = dao.searchBihin(katakanaBihinKana, bihinName);
        return list;
    }

    public static int getStatusSearch(String statusName) {
        int status;
        switch (statusName) {
        case "success":
            status = Bihin.AVAILABLE;
            break;
        case "fail":
            status = Bihin.USED;
            break;
        default:
            status = Bihin.OTHER;
            break;
        }
        return status;
    }

}
