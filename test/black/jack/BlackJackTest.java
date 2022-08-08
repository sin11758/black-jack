/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package black.jack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Navjot Singh
 * @author Gurminder Singh
 * @author Harman Sandhu
 */
public class BlackJackTest {
    
    public BlackJackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class BlackJack.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        BlackJack.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    
    
  @Test
    public void testCheckPlayerNumberGood() {
        System.out.println("checkPlayerNumber Good");
        int playerNo = 6;
        boolean expResult = true;
        boolean result = BlackJack.checkPlayerNumber(playerNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckPlayerNumberBad() {
        System.out.println("checkPlayerNumber Bad");
        int playerNo = 11;
        boolean expResult = false;
        boolean result = BlackJack.checkPlayerNumber(playerNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckPlayerNumberBoundary() {
        System.out.println("checkPlayerNumber boundary");
        int playerNo = 0;
        boolean expResult = false;
        boolean result = BlackJack.checkPlayerNumber(playerNo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } @Test
    
    
    public void testCheckbetGood() {
        System.out.println("Checkbet Good");
        int bet = 5;
        int points = 10;
        boolean expResult = true;
        boolean result = BlackJack.checkbet(bet,points);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckbetBad() {
        System.out.println("Checkbet Bad");
        int bet = 15;
        int points = 10;
        boolean expResult = false;
        boolean result = BlackJack.checkbet(bet,points);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckbetBoundary() {
        System.out.println("Checkbet Bad");
       int bet = 0;
        int points = 10;
        boolean expResult = false;
        boolean result = BlackJack.checkbet(bet,points);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckMoveGood() {
        System.out.println("CheckMove Good");
        String move = "hit";
        boolean expResult = true;
        boolean result = BlackJack.checkMove(move);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckMoveBad() {
        System.out.println("CheckMove Bad");
        String move = "hi";
        boolean expResult = false;
        boolean result = BlackJack.checkMove(move);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testCheckMoveBoundary() {
        System.out.println("CheckMove Bad");
        String move = "";
        boolean expResult = false;
        boolean result = BlackJack.checkMove(move);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
