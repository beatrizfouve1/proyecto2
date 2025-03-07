import com.iessanalberto.dam1.Operaciones;
import com.iessanalberto.dam1.Triangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

        @Test
        public void testCalcularArea() {
            Triangulo triangulo_test1_constructor_vacio = new Triangulo();
            assertEquals(40,triangulo_test1_constructor_vacio.getArea());
        }
    public void testCalcularArea1() {
        Triangulo triangulo_test1_constructor_simple = new Triangulo(50,50);
        assertEquals(125,triangulo_test1_constructor_simple.getArea());
    }


        @Test
        public void testConstructorNotNull() {
            Operaciones operaciones = new Operaciones(10, 8);
            assertNotNull(operaciones);
        }

        @Test
        public void testCalcularAreaValoresLimite() {
            Operaciones operaciones = new Operaciones(0, 8);
            assertEquals(0, operaciones.calcularArea());

            Operaciones operacionesNegativo = new Operaciones(-10, 8);
            assertTrue(operacionesNegativo.calcularArea() < 0);
        }


    }


