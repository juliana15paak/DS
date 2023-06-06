package prjFormas;

public class Trapezio extends Forma {
	private double h;
	private double bg;
	private double bp;
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getBg() {
		return bg;
	}
	public void setBg(double bg) {
		this.bg = bg;
	}
	public double getBp() {
		return bp;
	}
	public void setBp(double bp) {
		this.bp = bp;
	}
	public double calculo() {
		return ((bg+bp)*h)/2;
	}
}
