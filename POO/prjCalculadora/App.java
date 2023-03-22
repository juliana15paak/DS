import java.util.Scanner;
public class App {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int e;
		Calculadora c = new Calculadora();
		System.out.println("Digite o primeiro número:");
		c.num1=sc.nextInt();
		System.out.println("Digite o segundo número:");
		c.num2=sc.nextInt();
		System.out.println("Digite 1 para soma, 2 para subtração, 3 para divisão ou 4 para multiplicação");
		e=sc.nextInt();
		switch(e){
		case 1:
			c.soma();
			break;
		case 2:
			c.subtracao();
			break;
		case 3:
			c.divisao();
			break;
		case 4:
			c.multiplicacao();
			break;
		default:
			System.out.println("Número inválido");
		}
	}
}
