package main;

public class RTriangulo extends Triangulo{
	
	public RTriangulo(float base, float altura) {
		super(base, altura);
	}

	@Override
	public float getPerimetro() {
		float altura = getAltura();
		float base = getBase();
		return (float) (altura+base+(Math.sqrt((base*base)+(altura*altura))));
	}
	
	@Override
	public float getArea(){
		return super.getArea();
	}
}
