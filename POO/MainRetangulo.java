package applicationPOO;

import java.util.Scanner;

import entitiesPOO.Retangulo;

public class MainRetangulo {
	
	/* Fazer um programa para ler os valores da largura e altura de um ret�ngulo.
	 * Em seguida, mostrar na tela o valor de sua �rea, per�metro e diagonal.
	 */

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Retangulo ret = new Retangulo();
		
		System.out.println("Largura: ");
		ret.width = leia.nextDouble();
		System.out.println("Altura : ");
		ret.height = leia.nextDouble();
		
		
		ret.area();
		ret.perimeter();
		ret.diagonal();
		
		System.out.printf("�rea: %2.1f%n ", ret.area());
		System.out.printf("Per�metro: %2.1f%n ", ret.perimeter());
		System.out.printf("Diagonal: %2.1f%n ", ret.diagonal());
		leia.close();
		
	}

}
