/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestingca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author D00186562
 */
public class SoftwareTestingCATest {
    
    public SoftwareTestingCATest() {
    }

    /**
     * Test of approvalCheck method, of class SoftwareTestingCA.
     */
    @Test
    public void testApprovalCheck1() {
        //decision coverage
        System.out.println("approvalCheck test 1 - value exceeds 80%");
        int amount = 1000;
        int value = 2000;
        int salary = 200;
        boolean investment = false;
        int deposit = 1000;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        boolean expResult = false;
        boolean result = instance.approvalCheck(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testApprovalCheck2() {
        //decision coverage
        System.out.println("approvalCheck test 2 - exceeds 2.5 times salary");
        int amount = 1000;
        int value = 2000;
        int salary = 200;
        boolean investment = false;
        int deposit = 1000;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        boolean expResult = false;
        boolean result = instance.approvalCheck(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testApprovalCheck3() {
        //decision coverage
        System.out.println("approvalCheck test 3 - for investment");
        int amount = 1000;
        int value = 2000;
        int salary = 1000;
        boolean investment = true;
        int deposit = 1000;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        boolean expResult = false;
        boolean result = instance.approvalCheck(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testApprovalCheck4() {
        //decision coverage
        System.out.println("approvalCheck test 4 - deposit < 5000");
        int amount = 1000;
        int value = 2000;
        int salary = 1000;
        boolean investment = false;
        int deposit = 4500;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        boolean expResult = false;
        boolean result = instance.approvalCheck(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testApprovalCheck5() {
        //Statement coverage
        System.out.println("approvalCheck test 5 - deposit>5000");
        int amount = 1000;
        int value = 2000;
        int salary = 1000;
        boolean investment = false;
        int deposit = 5500;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        boolean expResult = true;
        boolean result = instance.approvalCheck(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    } 
    
    
    
    
    

    /**
     * Test of approvalCheck1 method, of class SoftwareTestingCA.
     */
    @Test
    public void test1ApprovalCheck1() {
        //decision coverage
        System.out.println("approvalCheck1 test 1 - value exceeds 80%");
        int amount = 1000;
        int value = 2000;
        int salary = 200;
        boolean investment = false;
        int deposit = 0;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        String expResult = "Don't approve";
        String result = instance.approvalCheck1(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void test2ApprovalCheck1() {
        //decision coverage
        System.out.println("approvalCheck1 test 2 - exceeds 2.5 times salary");
        int amount = 1000;
        int value = 2000;
        int salary = 200;
        boolean investment = false;
        int deposit = 0;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        String expResult = "Don't approve";
        String result = instance.approvalCheck1(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test3ApprovalCheck1() {
        //decision coverage
        System.out.println("approvalCheck1 test 3 - for investment");
        int amount = 1000;
        int value = 2000;
        int salary = 500;
        boolean investment = true;
        int deposit = 0;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        String expResult = "Don't approve";
        String result = instance.approvalCheck1(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test4ApprovalCheck1() {
        //decision coverage
        System.out.println("approvalCheck1 test 4 - deposit<5000");
        int amount = 1000;
        int value = 2000;
        int salary = 500;
        boolean investment = false;
        int deposit = 4999;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        String expResult = "Don't approve";
        String result = instance.approvalCheck1(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test5ApprovalCheck1() {
        System.out.println("approvalCheck1 test 5 - All true");
        int amount = 1000;
        int value = 2000;
        int salary = 500;
        boolean investment = false;
        int deposit = 5000;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        String expResult = "Approve";
        String result = instance.approvalCheck1(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
    }
    
    @Test
    public void test6ApprovalCheck1() {
        //Statement coverage
        System.out.println("approvalCheck1 test 6 - deposit above 20000");
        int amount = 1000;
        int value = 2000;
        int salary = 200;
        boolean investment = false;
        int deposit = 20001;
        SoftwareTestingCA instance = new SoftwareTestingCA();
        String expResult = "Approve with 2% discount";
        String result = instance.approvalCheck1(amount, value, salary, investment, deposit);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}  

