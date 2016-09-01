package ateam.test.logic;

import ateam.logic.ReturnBihinLogic;
import junit.framework.TestCase;

public class ReturnBihinLogicTest extends TestCase{
    public void testReturnBihin(){
        boolean bool = ReturnBihinLogic.returnBihin("U001", "B004");
        assertEquals(true, bool);

    }

}
