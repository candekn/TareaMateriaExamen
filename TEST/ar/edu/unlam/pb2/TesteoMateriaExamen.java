package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteoMateriaExamen {

	@Test 
	public void testQueMuestraLasNotas() throws Exception{
		Materia test1 = new Materia();
		test1.Evaluar(1, 7);
		Integer esperado = 7;
		assertEquals(esperado,test1.getExamen(1));
	}
	@Test
	(expected=Exception.class) //Esto se usa para verificar que se lance la exception
	public void testErrorEnNota() throws Exception{
		Materia test2 = new Materia();
		test2.Evaluar(2, 28);
	}
}
