package Exerc�ciosExtras;

import java.util.Scanner;

/*Problema "consumo"
Fazer um programa para ler a dist�ncia total (em km) percorrida por um carro, bem como o total de
combust�vel gasto por este carro ao percorrer tal dist�ncia. Seu programa deve mostrar o consumo
m�dio do carro, com tr�s casas decimais.*/

public class Relembrando7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float distancia, combustivelgasto, consumomedio;
		
		
		System.out.println("Informe a dist�ncia percorrida");
		distancia = leia.nextFloat();
		System.out.println("Informe o combust�vel gasto no trajeto");
		combustivelgasto = leia.nextFloat();

		consumomedio = distancia / combustivelgasto;
		
		System.out.printf("O consumo m�dio do carro foi de %2.3f", consumomedio);
		
		

	}

}
