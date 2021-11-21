package Uri1001;

import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva 
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até 
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a 
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme 
exemplo*/

public class Ex1134 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int comb1=0, comb2=0, comb3=0, codigo;
		
		System.out.println("Entre com o codigo");
		codigo = leia.nextInt();
		
		
		while (codigo != 4) {
			
			if (codigo == 1){
				
				comb1++;
			}
			else if(codigo == 2) {
				comb2++;
			}
			else if(codigo == 3) {
				comb3++;
			}
			else {
				System.out.println("Entre com um código válido!");
				System.out.println("---------------");
			}
			
			System.out.println("Entre com o codigo");
			codigo = leia.nextInt();
			
		}
		
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Àlcool: " + comb1);
		System.out.println("Gasolina 2: " + comb2);
		System.out.println("Diesel 3: " + comb3);
		leia.close();
	}

	
}
