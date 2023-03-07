import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

class CalculadoraTest {

    @TestFactory
    Stream<DynamicTest> dynamicTestsFromIntStream() {

        Calculadora calculadora = new Calculadora();

        int i, j;
        Integer[] resultadosArray = new Integer[100];

        for (i = 0; i < 100; i++) {
            for (j = 0; j < 100; j++) {
                if (i == j) {
                    resultadosArray[i] = i * j;
                }
            }
        }

        List<Integer> listaResultados = new ArrayList<>();
        for (Integer array : resultadosArray) {
            listaResultados.addAll(Arrays.asList(array));
        }


        return IntStream.iterate(0, n -> n + 1).limit(100)
                .mapToObj(n -> dynamicTest("Calculando cuadrados #" + n, () -> {
                        assertEquals(calculadora.multiplicacion(n, n), listaResultados.get(n));
                    }));
    }
}
