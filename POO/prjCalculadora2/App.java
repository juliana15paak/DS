
import java.util.Scanner;
public class App {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int e;
		int n1, n2;
		System.out.println("Digite o primeiro numero:");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		n2 = sc.nextInt();
		Calculadora c = new Calculadora(n1, n2);
		System.out.println("Digite 1 para soma, 2 para subtraçao, 3 para divisao ou 4 para multiplicacao");
		e=sc.nextInt();
		switch(e){
		case 1:
			c.soma();
			System.out.println(c.soma(n1, n2));
			break;
		case 2:
			System.out.println(c.subtracao(c.num1, c.num2));
			break;
		case 3:
			c.divisao(c.num1, c.num2);
			break;
		case 4:
			System.out.println(c.multiplicacao());
			break;
		default:
			System.out.println("Numero invalido");
		}
	}
}