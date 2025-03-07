import com.iessanalberto.dam1.Rectangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {

        @Test
        public void testCalcularArea() {
            Rectangulo rectangulo = new Rectangulo();
            assertEquals(40f,rectangulo.getArea());
        }

        public void testCalcularArea1() {
            Rectangulo triangulo_test1_constructor_simple = new Rectangulo(50f,50f);
            assertEquals(125f,triangulo_test1_constructor_simple.getArea());
        }


        @Test
        public void testConstructorNotNull() {
            Rectangulo rectangulo = new Rectangulo(10f, 8f);
            assertNotNull(rectangulo);
        }

        @Test
        public void testCalcularAreaValoresLimite() {
            Rectangulo rectangulo = new Rectangulo(10f, 8f);
            assertEquals(0f,Rectangulo.class);

           // Rectangulo rectangulo2 = new Rectangulo(-10, 8);
           // assertFalse(rectangulo2 < 0);
        }


    }


