package prjFormas;

public class Quadrado extends Forma {
	private double lado;
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double calculo() {
		return lado*lado;
	}
}
