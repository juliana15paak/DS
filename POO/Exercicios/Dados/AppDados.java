package Dados;
import java.util.Scanner;
public class AppDados {
	public static void main (String[]args) {
		Scanner sc= new Scanner (System.in);
		Dados d= new Dados();
		
		System.out.println("Digite seu nome:");
		d.nome= sc.nextLine();
		
		System.out.println("Digite sua idade:");
		d.idade= sc.nextInt();
		
		System.out.println("Digite seu peso:");
		d.peso= sc.nextDouble();
		
		d.nome();
		d.idade();
		System.out.println(d.menorOrMaior());
		System.out.println(d.setentakg());
	}
}