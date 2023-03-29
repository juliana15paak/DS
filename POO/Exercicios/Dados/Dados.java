package Dados;

public class Dados {
	String nome;
	int idade;
	double peso;
	String menor;
	String kg;
	
	public String nome() {
		return nome;
	}
	
	public int idade() {
		return idade;
	}
	 public String menorOrMaior() {
		 return (18 <= idade ? "O usuario e maior de idade" : "O usuario e menor de idade");
	 }
	 public String setentakg() {
		 return (70 >= peso ? "O usuario pesa menos que 70kgs" : "O usuario pesa mais que 70kgs");
	 }

}
