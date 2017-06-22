package tests;
import java.awt.List;

import org.junit.Assert;
import org.junit.Test;
import main.Circulo;
import main.Elipse;
import main.Geometria;
import main.Hexagono;
import main.ListGeometria;
import main.Rectangulo;
import main.Triangulo;
import main.ETriangulo;

public class TestGeometricApp {
	
	@Test
	public void TestAddGeometric(){
		
		ListGeometria lista = new ListGeometria();
		
		Assert.assertEquals(0, lista.size());
		
		Circulo geo1 = new Circulo(3.5f);
		lista.add(geo1); 
		Assert.assertEquals(1, lista.size());
		
		ETriangulo tri1 = new ETriangulo(6.2f);
		lista.add(tri1);
		Assert.assertEquals(2, lista.size());
		
		Hexagono hex1 = new Hexagono(2.2f);
		lista.add(hex1);
		Assert.assertEquals(3, lista.size());
		
		lista.remove(tri1);
		Assert.assertEquals(2, lista.size());

	}
	
	
	/**
	 * Método de ordenación
	 * Si se añaden dos figuras con los mismos lados entonces la primera en haber sido añadida será la primera.
	 */
	@Test
	public void TestSortGeometric(){
		
		ListGeometria lista = new ListGeometria();
		
		Assert.assertEquals(0, lista.size());
		
		Circulo geo1 = new Circulo(3.5f);
		lista.add(geo1); 
		Assert.assertEquals(1, lista.size());
		
		ETriangulo tri1 = new ETriangulo(6.2f);
		lista.add(tri1);
		Assert.assertEquals(2, lista.size());
		
		Hexagono hex1 = new Hexagono(2.2f);
		lista.add(hex1);
		Assert.assertEquals(3, lista.size());
		
		ETriangulo tri2 = new ETriangulo(4.4f);
		lista.add(tri2);
		Assert.assertEquals(4, lista.size());
		
		// PRUEBA DE SORT
		
		lista.sortByLados();
		
		Assert.assertEquals(tri1, lista.get(0));
		Assert.assertEquals(tri2, lista.get(1));
		Assert.assertEquals(hex1, lista.get(2));
		Assert.assertEquals(geo1, lista.get(3));
	

	}
	
}
