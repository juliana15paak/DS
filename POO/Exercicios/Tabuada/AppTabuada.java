package Tabuada;
import java.util.Scanner;
public class AppTabuada {
	public static void main(String []args) {
		Scanner in = new Scanner (System.in);
		Tabuada t = new Tabuada();
		System.out.println("Digite um número: ");
		t.num=in.nextInt();
		t.tabuada();
	}
}
