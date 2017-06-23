package main;

public class Rectangulo extends Geometria {

	final private int lados = 4; 
	private float ancho;
	private float alto;
	
	public Rectangulo(float ancho, float alto){
		this.ancho=ancho;
		this.alto=alto;
		this.setLados(lados);

	}
	
	@Override
	public float getPerimetro() {
		return 2*(alto+ancho);
	}
	
	@Override
	public float getArea(){
		return ancho*alto;
	}
	
	@Override
	public String toString(){
		return "Rectangulo\t | Lados : " + lados + " | Perimetro : " + getPerimetro() + " | Area : " + getArea();
	}
}
