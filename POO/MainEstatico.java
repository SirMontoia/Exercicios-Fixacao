package applicationPOO;

import java.util.Scanner;

import entitiesPOO.Estatico;

/* Fa�a um programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser
 * comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos
 * d�lares, considerando ainda que a pessoa ter� que pagar 6% de IOF sobre o valor
 * em d�lar.
 */

public class MainEstatico {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Estatico est = new Estatico ();
		double pagfinal;
		
		System.out.println("Entre com a cota��o atual do d�lar: ");
		est.cotacao = leia.nextDouble();
		System.out.println("Entre com a quantidade de d�lares comprada: ");
		est.quant = leia.nextInt();
		
		
		pagfinal = est.quantdolar() + est.IOF();
		
		System.out.printf("Ser�o pagos %2.2f reais", pagfinal);
		
		
		
		

	}

}
