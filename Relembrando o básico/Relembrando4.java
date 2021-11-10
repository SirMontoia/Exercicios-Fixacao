package ExercíciosExtras;

import java.util.Scanner;

/*Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente.*/

public class Relembrando4 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		float preco, valortotal, valorpago, troco;
		int quantidadeunidades;
		
		
		System.out.println("Qual o preço do produto comprado?");
		preco = leia.nextFloat();
		System.out.println("Qual a quantidade comprada do produto?");
		quantidadeunidades = leia.nextInt();
		System.out.println("Qual o valor dado pelo cliente?");
		valorpago = leia.nextFloat();
		
		
		valortotal = preco*quantidadeunidades;
		
		troco = valorpago - valortotal;
		
		
		System.out.printf("O troco a ser recebido é igual a %2.2f" , troco);
		
		

	}

}
