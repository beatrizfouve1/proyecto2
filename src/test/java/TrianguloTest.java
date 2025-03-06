import com.iessanalberto.dam1.Triangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

        @Test
        public void testCalcularArea() {
            Triangulo triangulo = new Triangulo(10, 8);
            assertEquals(40, triangulo.calcularArea());
        }

        @Test
        public void testConstructorNotNull() {
            Triangulo triangulo = new Triangulo(10, 8);
            assertNotNull(triangulo);
        }

        @Test
        public void testCalcularAreaValoresLimite() {
            Triangulo triangulo = new Triangulo(0, 8);
            assertEquals(0, triangulo.calcularArea());

            Triangulo trianguloNegativo = new Triangulo(-10, 8);
            assertTrue(trianguloNegativo.calcularArea() < 0);
        }
    }


