package hn.uth.Calculadora_de_Areas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@BeforeClass
    public static void Comienzo() {
        System.out.println("Comienzo de los Test");
    }
	
	@Test
	public void areaCirculo1() {
	    assertEquals(App.Area_circulo(3.0), 28.2744, 0.0001);
	}

	@Test
	public void areaCirculo2() {
	    assertEquals(App.Area_circulo(4.5), 63.6174, 0.0001);
	}

	@Test
	public void areaCirculo3() {
	    assertNull(App.Area_circulo(-2.0));
	}
	@Test
	public void areaCirculo4() {
		assertTrue(App.Area_circulo(0.0) == null);
	}
	
	
	
	@Test
	public void areaCuadrado1() {
	    assertEquals(App.Area_cuadrado(9.0), 81.0, 0.0001);
	}

	@Test
	public void areaCuadrado2() {
	    assertEquals(App.Area_cuadrado(7.5), 56.25, 0.0001);
	}

	@Test
	public void areaCuadrado3() {
	    assertFalse(App.Area_cuadrado(5.0) == 20.0);
	}
	@Test
	public void areaCuadrado4() {
	    assertNull(App.Area_cuadrado(-523.0));
	}
	
	
	
	@Test
	public void areaTriangulo1() {
	    assertNull(App.Area_triangulo(0.0, 7.8));
	}

	@Test
	public void areaTriangulo2() {
	    assertFalse(App.Area_triangulo(4.2, 3.5) == 10.0);
	}

	@Test
	public void areaTriangulo3() {
	    assertNotNull(App.Area_triangulo(9.6, 12.1));
	}
	
	
	
	public void areaRectangulo1() {
	    assertFalse(App.Area_rectangulo(4.5, 3.2) == 0);
	}

	@Test
	public void areaRectangulo2() {
	    assertEquals(App.Area_rectangulo(7.8, 2.5), 19.5, 0.0001);
	}

	@Test
	public void areaRectangulo3() {
	    assertEquals(App.Area_rectangulo(6.9, 5.2), 35.88, 0.0001);
	}
	
	@AfterClass
    public static void finalizacionPruebas() {
        System.out.println("Fin de los Test");
        
    }
}
