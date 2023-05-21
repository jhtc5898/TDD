package ec.edu.ups.tdd;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest
{
    private int a, b, expected;

    @Parameters
    public static Iterable<Object[]> parameter()
    {

        //Casos de prueba
        List<Object[]> objects = new ArrayList<>();
        objects.add(new Object[]{1,2,3});
        objects.add(new Object[]{2,2,4});
        objects.add(new Object[]{3,2,5});
        objects.add(new Object[]{4,2,6});
        return objects;

    }

    public CalculatorParametersTest (int a, int b, int expected)
    {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }



    @Test
    public void given_parameters_when_addition_them_ok()
    {
        Calculator c = new Calculator();
        int actual = c.addition(a,b);
        assertEquals(expected,actual);
    }




}