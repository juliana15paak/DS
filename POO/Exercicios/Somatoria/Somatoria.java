package Somatoria;

public class Somatoria {
	public void somatoria() {
		int i, soma;
		i = 1;
		soma = 0;
		while (i<=100) {
			soma = soma+i;
			i++;
			System.out.println("Soma: "+soma);
		}
	}
}
