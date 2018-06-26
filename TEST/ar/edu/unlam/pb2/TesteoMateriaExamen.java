package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteoMateriaExamen {

	@Test
	public void testQueDevuelveUnBooleanSiLaNotaEstaEntre1y10() {
		Materia test1 = new Materia();
		assertTrue(test1.Evaluar(1, 8));
	}
	@Test 
	public void testQueMuestraLasNotas(){
		Materia test2 = new Materia();
		test2.Evaluar(2, 10);
		test2.Evaluar(1, 5);
		Integer esperado=10;
		assertEquals(esperado, test2.getExamen(2));
	}
	@Test
	public void testQueSiPongoUnNumeroFueraDeRangoDevuelvaUnBoolean(){
		Materia test3 = new Materia();
		assertFalse(test3.Evaluar(1, 20));
	}

}
