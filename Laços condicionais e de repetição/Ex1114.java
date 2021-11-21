package Uri1001;

import java.util.Scanner;

public class Ex1114 {
	
	
	/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int senhacorreta;
		
		System.out.println("Entre com a senha");
		senhacorreta = leia.nextInt();
		
		while (senhacorreta != 2002) {
			System.out.println("Senha Inválida");
			System.out.println("");
			
			
			
			System.out.println("Entre com a senha");
			senhacorreta = leia.nextInt();
			
			
			
		}
		
		
		System.out.println("Acesso permitido");
		leia.close();

	}

}
