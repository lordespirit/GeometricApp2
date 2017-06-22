package main;

public class Rectangulo extends Geometria {

	final private int ladosRectangulo = 4; 
	private float ancho;
	private float alto;
	
	public Rectangulo(float ancho, float alto){
		this.ancho=ancho;
		this.alto=alto;
		this.setLados(ladosRectangulo);

	}
	
	@Override
	public float getPerimetro() {
		return 2*(alto+ancho);
	}
	
	@Override
	public float getArea(){
		return ancho*alto;
	}
}
