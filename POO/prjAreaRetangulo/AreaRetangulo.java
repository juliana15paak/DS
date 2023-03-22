package prjAreaRetangulo;

public class AreaRetangulo {
	int h, b, area, perimetro;
	
	public void area() {
		area=h*b;
		System.out.println("A area do retangulo e: "+area);
	}
	public void perimetro() {
		perimetro=h+h+b+b;
		System.out.println("O perimetro do retangulo e: "+perimetro);
	}
}