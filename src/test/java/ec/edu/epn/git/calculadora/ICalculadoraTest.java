package ec.edu.epn.git.calculadora;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculadoraTest {

    @Test
    public void given_two_integers_when_exponentiation_then_ok(){
        ICalculadora c = Mockito.mock(ICalculadora.class);
        Mockito.when(c.exponentiation(4,3)).thenReturn(64);
        assertEquals(64, c.exponentiation(4,3));
    }

}