package ateam.test.model;

import ateam.model.Department;
import junit.framework.TestCase;

public class DepartmetTest extends TestCase{
    public void testGetUserDeptID(){
        Department department = new Department();
        department.setDeptID("XXX");
        assertEquals("XXX",department.getDeptID());
    }
    public void testGetUserDeptKana(){
        Department department = new Department();
        department.setDeptKana("XXX");
        assertEquals("XXX",department.getDeptKana());
    }
    public void testGetUserDeptName(){
        Department department = new Department();
        department.setDeptName("XXX");
        assertEquals("XXX",department.getDeptName());
    }

}
