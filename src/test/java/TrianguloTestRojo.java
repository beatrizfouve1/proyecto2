import static org.junit.jupiter.api.Assertions.*;

import com.iessanalberto.dam1.Triangulo;
import org.junit.jupiter.api.Test;


public class TrianguloTestRojo {

    @Test
    public void testCalcularPerimetro() {
        Triangulo triangulo = new Triangulo(10, 8);
        assertEquals(28, triangulo.calcularPerimetro());
    }


}
