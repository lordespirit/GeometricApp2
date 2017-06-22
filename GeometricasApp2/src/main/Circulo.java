package main;

public class Circulo extends Geometria {
	
	final private int ladosCirculo = Integer.MAX_VALUE;
	private float radio;
	final private float  PI = 3.141592653589f;
	
	public Circulo(float radio){
		this.radio = radio;
		this.setLados(ladosCirculo);
	}

	@Override
	public float getPerimetro() {
		return 2 * PI * radio;
	}
	
	@Override
	public float getArea(){
		return (float) (PI * Math.pow(radio, 2));
	}

}
