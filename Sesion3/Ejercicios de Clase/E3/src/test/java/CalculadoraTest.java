import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import static org.junit.jupiter.api.Assertions.*;

@Suite
@SelectClasses({CalculadoraSumaTest.class, CalculadoraRestaTest.class, CalculadoraDividirTest.class, CalculadoraMultiplicacionTest.class})
class CalculadoraTest {

}