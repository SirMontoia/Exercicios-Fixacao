package Uri1001;

import java.util.Scanner;


/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem �Origem�.
Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a
situa��o.*/

public class Ex1041 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		double x,y;
		
		
		
		System.out.println("Entre com o valor de x e y respectivamente");
		x = leia.nextDouble();
		y = leia.nextDouble();
		
		
		if (x==0 && y==0) {
			System.out.println("Origem");
		}
		else if (x>0 && y>0) {
			System.out.println("Q1");
		}
		else if (x==0) {
			System.out.println("Eixo y");
		}
		else if(y==0) {
			System.out.println("Eixo x");
		}
		else if (x<0 && y>0) {
			System.out.println("Q2");
		}
		else if (x<0 && y<0) {
			System.out.println("Q3");
		}
		else if (x>0 && y<0) {
			System.out.println("Q4");
		}
		
	}

}
