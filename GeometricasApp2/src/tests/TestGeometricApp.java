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
		
		Assert.assertEquals(0, lista.getSize());
		
		Circulo geo1 = new Circulo(3.5f);
		lista.add(geo1); 
		Assert.assertEquals(1, lista.getSize());
		
		ETriangulo tri1 = new ETriangulo(6.2f);
		lista.add(tri1);
		Assert.assertEquals(2, lista.getSize());
		
		Hexagono hex1 = new Hexagono(2.2f);
		lista.add(hex1);
		Assert.assertEquals(3, lista.getSize());
		
		lista.remove(0);
		Assert.assertEquals(2, lista.getSize());

	}
	
}
