package banking;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sushma
 */
public class testBanking {
    bank b;
    public testBanking() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b = new bank();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testaddAccount() 
     {
         assertEquals("s",b.addAccount("s"), 0.0001);
     }
     
     public void testDeposit() 
     {
         assertEquals(1000, b.Deposit(0), 0.0001);
     }
     
     public void testWithdraw() 
     {
         assertEquals(1000,b.Withdraw(0), 0.0001);
     }
     
     public void testTransfer() 
     {
         assertEquals(1000, b.Transfer(0, 1), 0.0001);
     }
     
     public void testBalance() 
     {
         assertEquals(1000,b.Balance(0), 0.0001);
     }
     
    
}
