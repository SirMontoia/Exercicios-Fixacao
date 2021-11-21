package Uri1001;

import java.util.Scanner;

/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

public class Ex1037 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		double x;
		
		System.out.println("Entre com x");
		x = leia.nextDouble();
		
		if (0< x  && x <=25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (25<x && x<=50) {
			System.out.println("Intervalo [25,50]");
		}
		else if (50<x && x<=75) {
			System.out.println("Intervalo [50,75]");
		}
		else if (75 < x && x <100) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		

	}

}
