package ExercíciosExtras;

import java.util.Scanner;

/*Problema "idades"
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.*/

public class Relembrando3 {

	public static void main(String[] args) {
		
		String nome1, nome2;
		int idade1, idade2;
		double media;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Indique o nome da primeira pessoa");
		nome1 = leia.next();
		System.out.println("Indique o nome da segunda pessoa");
		nome2 = leia.next();
		System.out.println("Indique a idade da primeira pessoa");
		idade1 = leia.nextInt();
		System.out.println("Indique a idade da segunda pessoa");
		idade2 = leia.nextInt();
		
		media = (double) (idade1+idade2)/2;
				
		
		System.out.println("Nomes computados no sistema: " + nome1 + " e " + nome2);
		System.out.printf("Média das idades dos usuários : %2.1f " , media);
		
		
		
		
		

	}

}
