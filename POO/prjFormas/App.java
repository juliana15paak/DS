package prjFormas;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class App {
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		Forma f = new Forma();
		Quadrado q = new Quadrado();
		Retangulo r = new Retangulo();
		Triangulo tri = new Triangulo();
		Trapezio t = new Trapezio();
		//quadrado
		double ladoQuadrado = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o lado do quadrado:", "Quadrado", JOptionPane.QUESTION_MESSAGE));
		q.setLado(ladoQuadrado);
		JOptionPane.showMessageDialog(null,  "Area: " + q.calculo(), "Quadrado", JOptionPane.INFORMATION_MESSAGE);
		//retângulo
		double base = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base do retangulo:", "Retangulo", JOptionPane.QUESTION_MESSAGE));
		r.setB(base);
		double altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura do retangulo:", "Retangulo", JOptionPane.QUESTION_MESSAGE));
		r.setH(altura);
		JOptionPane.showMessageDialog(null,  "Area: " + r.calculo(), "Retangulo", JOptionPane.INFORMATION_MESSAGE);
		//triângulo
		double baseT = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base do triangulo:", "Triangulo", JOptionPane.QUESTION_MESSAGE));
		tri.setB(baseT);
		double alturaT = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura do Triangulo:", "Triangulo", JOptionPane.QUESTION_MESSAGE));
		tri.setH(alturaT);
		JOptionPane.showMessageDialog(null,  "Area: " + tri.calculo(), "Triangulo", JOptionPane.INFORMATION_MESSAGE);
		//trapézio
		double baseG = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base grande do trapezio:", "Trapezio", JOptionPane.QUESTION_MESSAGE));
		t.setBg(baseG);
		double baseP = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a base pequena do trapezio:", "Trapezio", JOptionPane.QUESTION_MESSAGE));
		t.setBp(baseP);
		double alturaTrap = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura do trapezio:", "Trapezio", JOptionPane.QUESTION_MESSAGE));
		t.setH(alturaTrap);
		JOptionPane.showMessageDialog(null,  "Area: " + t.calculo(), "Trapezio", JOptionPane.INFORMATION_MESSAGE);
		in.close();
	}
}
