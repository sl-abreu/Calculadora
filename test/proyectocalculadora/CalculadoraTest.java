/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author robot
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of main method, of class Calculadora.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
    }

    /**
     * Test of prioridad method, of class Calculadora.
     */
    @Test
    public void testPrioridad() {
        System.out.println("prioridad");
        char op = '+';
        int expResult = 1;
        int result = Calculadora.prioridad(op);
        assertEquals(expResult, result);
    }

    /**
     * Test of esOperador method, of class Calculadora.
     */
    @Test
    public void testEsOperador() {
        System.out.println("esOperador");
        char op = ' ';
        boolean expResult = false;
        boolean result = Calculadora.esOperador(op);
        assertEquals(expResult, result);
    }

    /**
     * Test of revisaExpresion method, of class Calculadora.
     */
    @Test
    public void testRevisaExpresion() {
        System.out.println("revisaExpresion");
        String exp = "  (2 - -2) *4";
        boolean expResult = true;
        boolean result = Calculadora.revisaExpresion(exp);
        assertEquals(expResult, result);
    }

    /**
     * Test of conviertePostFija method, of class Calculadora.
     */
    @Test
    public void testConviertePostFija() {
        System.out.println("conviertePostFija");
        String exp = "   (2- -2)* 4";
        String[] expResult = {"2","-2","-","4","*",";",null,null,null,null,null,null,null,null};
        String[] result = Calculadora.conviertePostFija(exp);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of evaluaPostFija method, of class Calculadora.
     */
    @Test
    public void testEvaluaPostFija() {
        System.out.println("evaluaPostFija");
        String[] postFija = {"2","-2","-","4","*",";",null,null,null,null,null,null,null,null};
        double expResult = 16.0;
        double result = Calculadora.evaluaPostFija(postFija);
        assertEquals(expResult, result, 0.0);
    }
    
}
