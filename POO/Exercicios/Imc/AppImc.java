package Imc;
import java.util.Scanner;
public class AppImc {
	public static void main (String [] args ) {
		Scanner in= new Scanner (System.in);
		Imc i= new Imc();
		System.out.println("Digite sua altura:");
		i.h= in.nextDouble();
		System.out.println("Digite seu peso:");
		i.kg= in.nextDouble();
		System.out.println("Seu imc e: "+i.imc());
		i.situacao();
	}
}
