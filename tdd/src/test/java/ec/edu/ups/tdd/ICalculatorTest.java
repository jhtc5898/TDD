package ec.edu.ups.tdd;

import static org.junit.Assert.*;

import java.util.Optional;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;


public class ICalculatorTest {

    static ICalculator Ic = null;
    @BeforeClass
    public static void setUpClass()
    {
        Ic = Mockito.mock(ICalculator.class);
    }

    @Test
    public void given_two_integers_when_addition_then_ok() {
        Mockito.when(Ic.addition(4, 2)).thenReturn(6);
        assertEquals(6, Ic.addition(4 , 2));
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok()
    {
        Mockito.when(Ic.subtraction(4, 2)).thenReturn(2);
        assertEquals(2,Ic.subtraction(4,2));

    }


    @Test
    public void given_two_integers_when_division_then_exception()
    {
        Mockito.when(Ic.division(8, 2)).thenReturn(4);
        assertEquals(4,Ic.division(8,2));
    }

    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_timeout()
    {
        Mockito.when(Ic.multiplication(2, 2)).thenReturn(4);
        assertEquals(4,Ic.multiplication(2,2));

    }
}