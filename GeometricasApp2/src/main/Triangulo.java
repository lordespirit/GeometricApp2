package main;

public class Triangulo extends Geometria {
	
	final private int ladosTriangulo = 3; 
	private float altura;
	private float base;
	
	public Triangulo(float base, float altura){
		this.base = base;
		this.altura = altura;
		this.setLados(ladosTriangulo);
	}
	
	@Override
	public float getPerimetro() {
		return 0;
	}
	
	@Override
	public String toString(){
		return null;
	}
	
	@Override
	public float getArea(){
			return ((base*altura)/2);
	}
	
	public float getAltura() {
		return altura;
	}

	public float getBase() {
		return base;
	}
	
	
}
