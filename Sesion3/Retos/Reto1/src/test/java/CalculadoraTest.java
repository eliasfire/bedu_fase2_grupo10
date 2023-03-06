import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Prueba División")
    void dividirTest() {
        int esperado = 5;

        assertEquals(esperado, calculadora.dividir(25, 5));
    }

    @Test
    @DisplayName("Prueba Exception División")
    void dividirExceptionTest() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(25, 0), "No se puede dividir entre 0");
    }

}