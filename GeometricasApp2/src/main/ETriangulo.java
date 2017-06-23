package main;

public class ETriangulo extends Triangulo{

	public ETriangulo(float base) {
		super(base, computeAlturaFromBase(base));
	}

	@Override
	public float getPerimetro() {
		float base = getBase();
		return 3*base;
	}
	
	@Override
	public float getArea(){
		return super.getArea();
	}
	
	private static float computeAlturaFromBase(float base){
		return (float) (Math.sqrt(3)*base/2);
	}

	@Override
	public String toString(){
		return "Triangulo Equi\t | Lados : " + getLados() + " | Perimetro : " + getPerimetro() + " | Area : " + getArea();
	}

}