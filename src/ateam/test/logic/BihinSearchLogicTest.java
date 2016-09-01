package ateam.test.logic;

import java.util.List;

import ateam.dao.BihinDAO;
import ateam.logic.BihinSearchLogic;
import ateam.model.Bihin;
import junit.framework.TestCase;;

public class BihinSearchLogicTest extends TestCase{
    public void testGetBihinSearchList(){
        BihinDAO dao = BihinDAO.getInstance();
        List<Bihin> list = dao.searchBihin(1);
        assertEquals(list.size() ,  BihinSearchLogic.getBihinSearchList(1).size());

    }

}
