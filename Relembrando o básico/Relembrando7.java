package ExercíciosExtras;

import java.util.Scanner;

/*Problema "consumo"
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
médio do carro, com três casas decimais.*/

public class Relembrando7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float distancia, combustivelgasto, consumomedio;
		
		
		System.out.println("Informe a distância percorrida");
		distancia = leia.nextFloat();
		System.out.println("Informe o combustível gasto no trajeto");
		combustivelgasto = leia.nextFloat();

		consumomedio = distancia / combustivelgasto;
		
		System.out.printf("O consumo médio do carro foi de %2.3f", consumomedio);
		
		

	}

}
