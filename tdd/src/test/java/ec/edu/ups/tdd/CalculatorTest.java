package ec.edu.ups.tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    Calculator c = null;


    //El @Before se ejecuta antes de CADA test
//    @BeforeClass
//    public void setUpClass()
//    {
//
//    }

    //El @Before se ejecuta antes de CADA test
    @Before
    public void setUp()
    {
        c = new Calculator();
    }

    @Test
    public void given_two_integers_when_addition_then_ok(){
        Calculator c = new Calculator();
        int expected= 6;
        int actual = c.addition(4,2);

        //El assertEquals compara los dos valores y si son iguales el test pasa
        assertEquals(expected,actual);
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok()
    {
        assertEquals(2,c.subtraction(4,2));

    }


    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception()
    {
        assertEquals(2,c.division(4,0));

    }

    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_timeout()
    {
        assertEquals(4,c.multiplication(2,2));

    }

    //Ejecuta despues de CADA test
    @After
    public void tearDown ()
    {
       c.setAns(0);
    }

    //Ejecuta despues de test una solo vez
//    @AfterClass
//    public void tearDownClass ()
//    {
//        c.setAns(0);
//    }



}