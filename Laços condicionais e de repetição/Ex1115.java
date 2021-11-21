package Uri1001;

import java.util.Scanner;

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema 
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

public class Ex1115 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		float x, y;
		
		System.out.println("Entre com x");
		x=leia.nextFloat();
		System.out.println("Entre com y");
		y = leia.nextFloat();
		
		
		while (x != 0 && y != 0) {
			
			if (x>0 && y>0) {
				System.out.println("Quadrante 1");
				System.out.println();
			}
			else if (x<0 && y>0) {
				System.out.println("Quadrante 2");
				System.out.println();
			}
			else if (x<0 && y<0) {
				System.out.println("Quadrante 3");
				System.out.println();
			}
			else {
				System.out.println("Quadrante 4");
				System.out.println();
			}
			
			System.out.println("Entre com x");
			x= leia.nextFloat();
			System.out.println("Entre com y");
			y = leia.nextFloat();
		}
		
		System.out.println("");
		leia.close();
	}

}
