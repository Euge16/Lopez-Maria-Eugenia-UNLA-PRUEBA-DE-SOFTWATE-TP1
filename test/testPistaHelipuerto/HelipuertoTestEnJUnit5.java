package testPistaHelipuerto;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import avion.AvionComputarizado;
import avion.AvionPesado;
import avion.AvionSimple;
import avion.Helicoptero;
import copControl.Mapa;
import copControl.Posicion;
import pista.Helipuerto;
import pista.PosicionesEntradaVaciaException;

public class HelipuertoTestEnJUnit5 {
	
	private Helipuerto helipuerto;
    private Posicion posicion;

    @BeforeEach
    public void setUp() throws PosicionesEntradaVaciaException {
        posicion = new Posicion(0, 0);
        helipuerto = new Helipuerto(posicion);
    }
    

    @Test
    public void testNoPuedeAterrizarAvionSimple() {
        // Prueba si un AvionSimple puede aterrizar en el helipuerto
        AvionSimple avionSimple = new AvionSimple(posicion,posicion, new Mapa());
        boolean resultado = helipuerto.puedeAterrizar(avionSimple);
        assertFalse(resultado, "Un AvionSimple no debería poder aterrizar en un helipuerto");
    }

    @Test
    public void testNoPuedeAterrizarAvionPesado() {
        // Prueba si un AvionPesado puede aterrizar en el helipuerto
        AvionPesado avionPesado = new AvionPesado(posicion,posicion, new Mapa());
        boolean resultado = helipuerto.puedeAterrizar(avionPesado);
        assertFalse(resultado, "Un AvionPesado no debería poder aterrizar en un helipuerto");
    }

    @Test
    public void testNoPuedeAterrizarAvionComputarizado() {
        // Prueba si un AvionComputarizado puede aterrizar en el helipuerto
        AvionComputarizado avionComputarizado = new AvionComputarizado(posicion, new Mapa());
        boolean resultado = helipuerto.puedeAterrizar(avionComputarizado);
        assertFalse(resultado, "Un AvionComputarizado no debería poder aterrizar en un helipuerto");
    }

    @Test
    public void testPuedeAterrizarHelicoptero() {
        // Prueba si un Helicoptero puede aterrizar en el helipuerto
        Helicoptero helicoptero = new Helicoptero(posicion,posicion, new Mapa());
        boolean resultado = helipuerto.puedeAterrizar(helicoptero);
        assertTrue(resultado, "Un Helicoptero debería poder aterrizar en un helipuerto");
    }

    @Test
    public void testGetX() {
        // Prueba el método getX
        int x = helipuerto.getX();
        assertEquals(0, x, "La coordenada X debe ser 0");
    }

    @Test
    public void testGetY() {
        // Prueba el método getY
        int y = helipuerto.getY();
        assertEquals(0, y, "La coordenada Y debe ser 0");
    }
	
	
}
	





	

