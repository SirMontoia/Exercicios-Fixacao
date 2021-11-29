package applicationPOO;

import java.util.Scanner;

import entitiesPOO.Estatico;

/* Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser
 * comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos
 * dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre o valor
 * em dólar.
 */

public class MainEstatico {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Estatico est = new Estatico ();
		double pagfinal;
		
		System.out.println("Entre com a cotação atual do dólar: ");
		est.cotacao = leia.nextDouble();
		System.out.println("Entre com a quantidade de dólares comprada: ");
		est.quant = leia.nextInt();
		
		
		pagfinal = est.quantdolar() + est.IOF();
		
		System.out.printf("Serão pagos %2.2f reais", pagfinal);
		
		
		
		

	}

}
