package ateam.test.logic;

import java.sql.Date;

import ateam.logic.RequestLogic;
import junit.framework.TestCase;

public class RequestLogicTest extends TestCase{
    public void testRequestBihinTrue() {
        String datestr = "2016-12-24";
        Date date = Date.valueOf(datestr);
        assertEquals(true,RequestLogic.requestBihin("B001", "U001",date ));
    }

    public void testRequestBihinFalse() {
        String datestr = "2016-12-24";
        Date date = Date.valueOf(datestr);
        assertEquals(false,RequestLogic.requestBihin("B004", "U001",date ));
    }
}
