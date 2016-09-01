package ateam.test.logic;

import java.util.List;

import ateam.logic.BihinSearchLogic;
import ateam.model.Bihin;
import junit.framework.TestCase;;

public class BihinSearchLogicTest extends TestCase{
    public void testGetBihinSearchList(){
        List<Bihin> list = BihinSearchLogic.getBihinSearchList(1);
        assertEquals(14 , list.size());
        assertEquals("B001", list.get(0).getBihinID());
        assertEquals("B002", list.get(1).getBihinID());
        assertEquals("B003", list.get(2).getBihinID());

    }

    public void testGetBihinSearchList2(){
        List<Bihin> list = BihinSearchLogic.getBihinSearchList("フセン", "フセン", 1);
        assertEquals(2 , list.size());
        assertEquals("B007", list.get(0).getBihinID());
        assertEquals("B008", list.get(1).getBihinID());
    }

    public void testGetBihinSearchList3(){
        List<Bihin> list = BihinSearchLogic.getBihinSeachList("フセン", "フセン");
        assertEquals(3 , list.size());
        assertEquals("B004", list.get(0).getBihinID());
        assertEquals("B007", list.get(1).getBihinID());
        assertEquals("B008", list.get(2).getBihinID());
    }

    public void testGetStatusSearch(){
        int status = BihinSearchLogic.getStatusSearch("success");
        assertEquals(1, status);
    }

}
