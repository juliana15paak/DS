package prjFormas;

public class Retangulo extends Forma {
	private double b;
	private double h;
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double calculo() {
		return b*h;
	}
}
