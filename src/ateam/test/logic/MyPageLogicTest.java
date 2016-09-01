package ateam.test.logic;

import java.util.List;

import ateam.logic.MyPageLogic;
import ateam.model.Bihin;
import junit.framework.TestCase;

public class MyPageLogicTest extends TestCase{
    public void testGetBihinList(){
        List<Bihin> list = MyPageLogic.getBihinList("U001");
        assertEquals(1 , list.size());
        assertEquals("B004", list.get(0).getBihinID());

    }

}
