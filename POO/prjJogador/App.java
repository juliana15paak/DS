package prjJogador;
import java .util.Scanner;
public class App {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Jogador j= new Jogador();
		
		System.out.println("Digite o nome dop jogador:");
		j.nome= sc.nextLine();
		
		System.out.println("O jogador escalado foi:" +j.nome);
		j.chutar();
		j.gol();
	}
}
