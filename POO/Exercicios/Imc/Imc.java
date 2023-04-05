package Imc;

public class Imc {
	double h;
	double kg;
	double imc;
	
	public double imc (){
		imc=kg/(h*h);
		return imc;
	}
	public String situacao() {
		if(imc>40) {
			return "Obesidade (Grau III)";
		}
		else if(imc>35) {
			return "Obesidade (Grau II)";
		}
		else if(imc>30) {
			return "Obesidade (Grau I)";
		}
		else if(imc>25) {
			return "Excesso de peso";
		}
		else if(imc>=18.5 | imc==18.5) {
			return "Peso normal";
		}
		else {
			return "Excesso de magreza";
		}
	}
}