package main;

public abstract class Geometria {

	private int lados;
	
	public Geometria(int lados){
		this.lados = lados;
	}
	
	public Geometria(){}
	
	public float getArea(){
		return 0;
	}
	
	public abstract float getPerimetro();

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}
	
}
