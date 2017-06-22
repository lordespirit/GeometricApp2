package main;

public class Hexagono extends Geometria {

	final private int ladosHexagono = 6;
	private float lado;
	
	public Hexagono(float lado){
		this.lado=lado;
		this.setLados(ladosHexagono);
	}
	
	@Override
	public float getPerimetro() {
		return 6*lado;
	}
	
	@Override
	public float getArea(){
		/*
		float anguloCentral = 360/6;
		float apotema = (float) (lado/(2*Math.tan(anguloCentral/2)));
		return 3*lado*apotema;
		 */
		return (float) (3*Math.sqrt(3)*lado*lado)/2;
	}
	
}
