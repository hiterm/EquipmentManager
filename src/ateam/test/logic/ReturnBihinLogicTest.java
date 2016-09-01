package ateam.test.logic;

import java.sql.Date;

import ateam.logic.RequestLogic;
import ateam.logic.ReturnBihinLogic;
import junit.framework.TestCase;

public class ReturnBihinLogicTest extends TestCase{
    public void testReturnBihin(){
        String datestr = "2016-12-24";
        Date date = Date.valueOf(datestr);
        RequestLogic.requestBihin("B002", "U002",date );
        boolean bool = ReturnBihinLogic.returnBihin("U002", "B002");
        assertTrue(bool);
        boolean secondBool = ReturnBihinLogic.returnBihin("U001", "B005");
        assertFalse(secondBool);

    }

}
