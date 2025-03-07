import static org.junit.jupiter.api.Assertions.*;

import com.iessanalberto.dam1.Operaciones;
import org.junit.jupiter.api.Test;


public class OperacionesTestRojo {

    @Test
    public void testCalcularPerimetro() {
        Operaciones operaciones = new Operaciones(10, 8);
        assertEquals(28, operaciones.calcularPerimetro());
    }


}
