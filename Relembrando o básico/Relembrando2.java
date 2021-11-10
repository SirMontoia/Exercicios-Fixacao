package ExercíciosExtras;

import java.util.Scanner;

public class Relembrando2 {

	public static void main(String[] args) {
		
/*Problema "retangulo"
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.*/
		
		
		float base;
		float altura; 
		float area;
		float perimetro;
		float diagonal;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Informe o valor da base");
		base = leia.nextFloat();
		System.out.println("Informe o valor da altura");
		altura = leia.nextFloat();
		
		area = base*altura;
		
		perimetro = (2*base) + (2*altura);
		
		diagonal = (float) Math.sqrt((Math.pow(base	, 2) + Math.pow(altura, 2)));
		
		System.out.printf("A area do retângulo é igual a %2.4f " , area);
		System.out.println();
		System.out.printf("O perímetro do retângulo é igual a %2.4f " ,perimetro);
		System.out.println();
		System.out.printf("A diagonal do retângulo é igual a %2.4f " , diagonal);
		
	
		

	}

}
