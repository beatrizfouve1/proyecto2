import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.iessanalberto.dam1.Rectangulo;
import org.junit.jupiter.api.Test;


public class RectanguloMockitoTest {

    @Test
    public void testCalcularAreaConMock() {
        Rectangulo rectangulo = mock(Rectangulo.class);
        when(rectangulo.getBase()).thenReturn(10f);
        when(rectangulo.getAltura()).thenReturn(8f);
        when(rectangulo.getArea()).thenReturn(40f);


        assertEquals(40f, rectangulo.getArea());
    }

}
