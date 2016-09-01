package ateam.test.logic;

import java.util.List;

import ateam.logic.BihinListLogic;
import ateam.model.Bihin;
import junit.framework.TestCase;

public class BihinListLogicTest extends TestCase{
    public void testGetAllBihinList() {
        List<Bihin> list =  BihinListLogic.getAllBihinList();
        assertEquals(100,list.size());
        assertEquals("B001",list.get(0).getBihinID());
        assertEquals("B002",list.get(1).getBihinID());
        assertEquals("B003",list.get(2).getBihinID());

    }
}
