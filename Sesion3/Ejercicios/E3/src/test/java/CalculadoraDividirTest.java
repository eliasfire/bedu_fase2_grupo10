import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDividirTest {

    static Calculadora calculadora;

    @BeforeAll
    static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    @DisplayName("Prueba division")
    void dividir() {
        int esperado = 9;
        assertEquals(esperado, calculadora.dividir(18, 2));
    }
}