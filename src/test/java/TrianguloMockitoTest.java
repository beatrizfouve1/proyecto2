import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.iessanalberto.dam1.ServicioTriangulo;
import com.iessanalberto.dam1.Triangulo;
import org.junit.jupiter.api.Test;


public class TrianguloMockitoTest {

    @Test
    public void testCalcularAreaConMock() {
        ServicioTriangulo servicioMock = mock(ServicioTriangulo.class);
        when(servicioMock.obtenerBase()).thenReturn(10);
        when(servicioMock.obtenerAltura()).thenReturn(8);

        Triangulo triangulo = new Triangulo(servicioMock);
        assertEquals(40, triangulo.calcularArea());

        verify(servicioMock).obtenerBase();
        verify(servicioMock).obtenerAltura();
    }

}
