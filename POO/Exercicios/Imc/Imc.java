package Imc;

public class Imc {
	double h;
	double kg;
	double imc;
	
	public double imc (){
		imc=kg/(h*h);
		return imc;
	}
	public void situacao() {
		if(imc>40) {
			System.out.println("Obesidade (Grau III)");
		}
		else if(imc>35) {
			System.out.println("Obesidade (Grau II)");
		}
		else if(imc>30) {
			System.out.println("Obesidade (Grau I)");
		}
		else if(imc>25) {
			System.out.println("Excesso de peso");
		}
		else if(imc>=18.5 | imc==18.5) {
			System.out.println("Peso normal");
		}
		else {
			System.out.println("Excesso de magreza");
		}
	}
}