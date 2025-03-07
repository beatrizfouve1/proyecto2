import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.iessanalberto.dam1.Triangulo;
import com.iessanalberto.dam1.Operaciones;
import org.junit.jupiter.api.Test;


public class TrianguloMockitoTest {

    @Test
    public void testCalcularAreaConMock() {
        Triangulo triangulo_mock = mock(Triangulo.class);
        when(triangulo_mock.getBase()).thenReturn(10);
        when(triangulo_mock.getAltura()).thenReturn(8);
        when(triangulo_mock.getArea()).thenReturn(40);


        assertEquals(40, triangulo_mock.getArea());
    }

}
