import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Prueba Suma")
    void suma() {
        int esperado = 5;

        assertEquals(esperado, calculadora.suma(3, 2));
    }

    @Test
    @DisplayName("Prueba Resta")
    void resta() {
        int esperado = 1;

        assertEquals(esperado, calculadora.resta(3, 2));
    }

    @Test
    @DisplayName("Prueba Multiplicación")
    void multiplicacion() {
        int esperado = 6;

        assertEquals(esperado, calculadora.multiplicacion(3, 2));
    }
}