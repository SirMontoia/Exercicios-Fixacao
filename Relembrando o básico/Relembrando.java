package ExercíciosExtras;

import java.util.Scanner;

public class Relembrando {

	public static void main(String[] args) {
		
		
	/*Problema "terreno"
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
duas casas decimais, conforme exemplo.*/
		
		
		float largura;
		float comprimento;
		float valor;
		float area;
		float preco;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Por favor, informe a largura do terreno");
		largura = leia.nextFloat();
		System.out.println("Por favor, informe o comprimento do terreno");
		comprimento = leia.nextFloat();
		System.out.println("Por favor, informe o valor do metro quadrado");
		valor = leia.nextFloat();
		
		
		area = largura*comprimento;
		valor = area*valor;
		
		System.out.printf("A área em questão tem %2.2f" , area);
		System.out.println();
		System.out.printf("O valor do terreno em questão é %2.2f", valor);

	}

}
