package vetores;

import java.util.Scanner;

import vetores.entities.AluguelQuartos;

/* A dona de um pensionato possui dez quartos para alugar para estudantes, sendo
 * esses quartos identificados pelos números 0 a 9.
 * 
 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma
 * quantidade N representando o número de estudantes que vão alugar quartos (N pode
 * ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada registro
 * de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele
 * escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, seu 
 * programa deve imprimir um relatório de todas as ocupações do pensionato, por 
 * ordem de quarto.
 * 
 * 
 * 
 * 
 */



public class VetorAluguelQuarto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String nome, email;
		int quarto;
		
		System.out.println("Quantos estudantes alugaram o quarto?");
		int n = leia.nextInt();
		
		AluguelQuartos[] aluguel = new AluguelQuartos[10];
		
		
		
		
		if (n>=1 && n<=10) {
			for (int i =1 ; i<=n ; i++) {
				
				System.out.println("Aluguel #" + i );
				System.out.println("Entre com o nome de quem aluga: ");
				
				nome = leia.next();
				System.out.println("Entre com o email de quem aluga: ");
				email = leia.next();
				System.out.println("Entre com o numero do quarto de quem aluga: ");
				quarto= leia.nextInt();
				
				
				aluguel[quarto] = new AluguelQuartos (nome, email, quarto ); 
				// Decide que o quarto ocupado ocupa o mesmo valor numerico dentro do vetor
				
				
			}
		} else {
			System.out.println("Entre com um valor no intervalo de 1 até 10!");
		}
		
		System.out.println("Quartos ocupados: ");
		for (int i=0 ; i<10; i++) {
			if (aluguel[i] != null) /* Apenas os ocupados aparecem, em ordem */ {
				System.out.println(i + ":" + aluguel[i]);
			}
		}
		
	}
	
	

}
