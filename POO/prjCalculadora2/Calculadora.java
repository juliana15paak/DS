public class Calculadora {
	int num1;
	int num2;
	int resultado;
	public  Calculadora(int n1, int n2){
		this.num1 = n1;
		this.num2 = n2;
	}	
	
	public void soma() {
		resultado=num1+num2;
		System.out.println(resultado);
	}
	//sobrecarga da soma
	public int soma(int num1, int num2) {
		resultado=num1+num2;
		return resultado;
	}
	
	public int subtracao(int num1, int num2) {
		resultado=num1-num2;
		return resultado;
	}
	public void divisao(int num1, int num2) {
		if(num1 == 0 || num2 == 0){
			System.out.println("Nao é possivel dividir por zero");
		}else {
			resultado=num1/num2;
			System.out.println(resultado);
		}
	}
	public int multiplicacao() {
		resultado=num1*num2;
		return resultado;
	}
}