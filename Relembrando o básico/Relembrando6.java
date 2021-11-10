package ExercíciosExtras;

import java.util.Scanner;

/*Problema "pagamento"
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
uma mensagem explicativa, conforme exemplo.*/


public class Relembrando6 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		String nome;
		float pagamentohora, pagamentototal;
		int horastrabalhadas;
		
		System.out.println("Informe o nome do funcionário");
		nome = leia.next();
		System.out.println("Informe o valor-hora");
		pagamentohora = leia.nextFloat();
		System.out.println("Quantas horas foram trabalhadas?");
		horastrabalhadas = leia.nextInt();
		
		pagamentototal = horastrabalhadas*pagamentohora;
		
		System.out.printf("O pagamento total é igual a %2.2f", pagamentototal);
		
		

	}

}
