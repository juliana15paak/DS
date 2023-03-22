package prjAreaRetangulo;
import java.util.Scanner;
public class App {
	public static void main (String []args) {
		Scanner in = new Scanner (System.in);
		AreaRetangulo a = new AreaRetangulo();
		System.out.println("Digite a altura do retangulo: ");
		a.h=in.nextInt();
		System.out.println("Digite a base do retangulo: ");
		a.b=in.nextInt();
		a.area();
		a.perimetro();
	}
}
