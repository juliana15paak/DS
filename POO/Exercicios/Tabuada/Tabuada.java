package Tabuada;

public class Tabuada {
	int num;
	int resultado;
	public void tabuada() {
		for(int i=1; i<11; i++) {
			resultado=num*i;
			System.out.println(num+"x"+i+"="+resultado);
		}
	}
}
