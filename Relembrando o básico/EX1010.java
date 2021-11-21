package Uri1001;

import java.util.Scanner;

public class EX1010 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo1, codigo2, quant1, quant2;
		float preco1, preco2, totalapagar;

		System.out.println("Informe o codigo do produto 1 e 2 respectivamente:");
		codigo1 = leia.nextInt();
		codigo2 = leia.nextInt();
		System.out.println("Informe o preço do produto 1 e 2 respectivamente:");
		preco1 = leia.nextFloat();
		preco2 = leia.nextFloat();
		System.out.println("Quantas unidades comprou do produto 1 e 2 respectivamente?");
		quant1 = leia.nextInt();
		quant2 = leia.nextInt();

		totalapagar = (quant1 * preco1) + (quant2 * preco2);

		System.out.printf(" VALOR A PAGAR: %2.2f " , totalapagar);

	}

}
