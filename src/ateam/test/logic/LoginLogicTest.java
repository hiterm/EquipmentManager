package ateam.test.logic;

import ateam.logic.LoginLogic;
import ateam.model.User;
import junit.framework.TestCase;

public class LoginLogicTest extends TestCase{
    public void testLogin() {
        User user = LoginLogic.login("U001", "A0000001");
        assertEquals("U001",user.getUserID());
        assertEquals("A0000001",user.getPassword());
        assertEquals("田中",user.getUserName());
        assertEquals("タナカ",user.getUserKana());
        assertEquals("D001",user.getDeptID());
        assertEquals(1,user.getAuthority());
    }

    public void testLogin2() {
        User user = LoginLogic.login("U001", "A000");
        assertEquals(null,user);
    }
}
