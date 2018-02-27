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
 * @author adeandakuri
 */
public class ProcesadorExpresionesTest {

    public ProcesadorExpresionesTest() {
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
     * Dependiendo del operador, el programa le asigna una prioridad.
     */
    @Test
    //Test 1 y 2 prueban el método que asigna prioridades a los operadores.
    public void testPrioridad() {
        System.out.println("prioridad");
        char op = '+';
        int expResult = 1;
        int result = ProcesadorExpresiones.prioridad(op);
        assertEquals(expResult, result);
    }

    public void testPrioridad2() {
        System.out.println("prioridad");
        char op = '*';
        int expResult = 2;
        int result = ProcesadorExpresiones.prioridad(op);
        assertEquals(expResult, result);
    }

    /**
     * Test of esOperador method, of class Calculadora.
     */
    @Test
    //El metodo solo debe regresar true si el caracter es un operador
    //Nota: los operadores que utilizaremos son: + , - , *, / , ^.
    public void testEsOperador() {
        System.out.println("esOperador");
        char op = '+';
        boolean expResult = true;
        boolean result = ProcesadorExpresiones.esOperador(op);
        assertEquals(expResult, result);
    }

    /**
     * Test of esOperador method, of class Calculadora.
     */
    @Test
    public void testEsOperador2() {
        System.out.println("esOperador");
        char op = '9';
        boolean expResult = false;
        boolean result = ProcesadorExpresiones.esOperador(op);
        assertEquals(expResult, result);
    }

    /**
     * Test of revisaExpresion method, of class Calculadora.
     */
    @Test
    //Test1: tiene un ')' extra. false
    public void testRevisaExpresion() {
        System.out.println("revisaExpresion");
        String exp = "(3.2)+(4.5+)2.1-4)*(3.3)";
        boolean expResult = false;
        boolean result = ProcesadorExpresiones.revisaExpresion(exp);
        assertEquals(expResult, result);
    }

    /**
     * Test of revisaExpresion method, of class Calculadora.
     */
    @Test
    //Test 2: comienxa con un ')'. false
    public void testRevisaExpresion2() {
        System.out.println("revisaExpresion");
        String exp = ")3.2()+(4.5+2.1-4)*(3.3)";
        boolean expResult = false;
        boolean result = ProcesadorExpresiones.revisaExpresion(exp);
        assertEquals(expResult, result);
    }

    /**
     * Test of revisaExpresion method, of class Calculadora.
     */
    @Test
    //Test3: expresion correcta. true
    public void testRevisaExpresion3() {
        System.out.println("revisaExpresion");
        String exp = "(3.2)+(4.5+2.1-4)*(3.3)";
        boolean expResult = true;
        boolean result = ProcesadorExpresiones.revisaExpresion(exp);
        assertEquals(expResult, result);
    }

    /**
     * Test of revisaExpresion method, of class Calculadora.
     */
    @Test
    //Test4: tiene un punto decimal mal colocado. false
    public void testRevisaExpresion4() {
        System.out.println("revisaExpresion");
        String exp = "(-.3.2)+(4.5+2.1-4)*(3.3)";
        boolean expResult = false;
        boolean result = ProcesadorExpresiones.revisaExpresion(exp);
        assertEquals(expResult, result);
    }
   
    @Test
    //Test5: Doble (--) debe ser true.
    public void testRevisaExpresion5() {
        System.out.println("revisaExpresion");
        String exp = "(--3.2)+(4.5+2.1-4)*(3.3)";
        boolean expResult = true;
        boolean result = ProcesadorExpresiones.revisaExpresion(exp);
        assertEquals(expResult, result);
    }
    
    @Test
    //Test6: triple (---) debe ser false.
    public void testRevisaExpresion6() {
        System.out.println("revisaExpresion");
        String exp = "(---3.2)+(4.5+2.1-4)*(3.3)";
        boolean expResult = false;
        boolean result = ProcesadorExpresiones.revisaExpresion(exp);
        assertEquals(expResult, result);
    }

    /**
     * Se prueba la correcta conversión de notación infija a postfija.
     */
    @Test
    public void testConviertePostFija() {
        System.out.println("conviertePostFija");
        String exp = "(6+2)*3/2-4";
        String[] expResult = {"6" ,"2", "+", "3", "*", "2", "/", "4", "-",";", null, null} ;
        String[] result = ProcesadorExpresiones.conviertePostFija(exp);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of evaluaPostFija method, of class Calculadora.
     */
    @Test
    public void testEvaluaPostFija() {
        System.out.println("evaluaPostFija");
        String[] postFija =  {"6" ,"2", "+", "3", "*", "2", "/", "4", "-",";", null, null} ;
        double expResult = 8.0;
        double result = ProcesadorExpresiones.evaluaPostFija(postFija);
        assertEquals(expResult, result, 0.0);
    }

}

