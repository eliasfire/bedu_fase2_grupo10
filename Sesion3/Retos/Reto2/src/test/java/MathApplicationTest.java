import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MathApplicationTest {

    @Mock
    CalculadoraService calculadoraService;

    @InjectMocks
    MathApplication mathApplication;

    @Test
    //Prueba fallida pues el método no tiene interacción con el objeto mock
    void pruebaSuma() {
        when(calculadoraService.add(13.0, 2.75)).thenReturn(15.75);
        assertEquals(mathApplication.add(13.0, 2.75), 15.75, 0);
        verify(calculadoraService).add(13.0, 2.75);
    }


    @Test
    void subtract() {
        when(calculadoraService.subtract(13.0, 3.0)).thenReturn(10.0);
        assertEquals(mathApplication.subtract(  13.0, 3.0), 10.0, 0);
        verify(calculadoraService).subtract(13.0, 3.0);
    }

    @Test
    void multiply() {
        when(calculadoraService.multiply(3.0, 3.0)).thenReturn(9.0);
        assertEquals(mathApplication.multiply(  3.0, 3.0), 9.0, 0);
        verify(calculadoraService).multiply(3.0, 3.0);
    }

    @Test
    void divide() {
        when(calculadoraService.divide(3.0, 3.0)).thenReturn(1.0);
        assertEquals(mathApplication.divide(  3.0, 3.0), 1.0, 0);
        verify(calculadoraService).divide(3.0, 3.0);
    }
}