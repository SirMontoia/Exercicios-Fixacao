package Exerc�ciosExtras;

import java.util.Scanner;

public class Relembrando2 {

	public static void main(String[] args) {
		
/*Problema "retangulo"
Fazer um programa para ler as medidas da base e altura de um ret�ngulo. Em seguida, mostrar o valor
da �rea, per�metro e diagonal deste ret�ngulo, com quatro casas decimais, conforme exemplos.*/
		
		
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
		
		System.out.printf("A area do ret�ngulo � igual a %2.4f " , area);
		System.out.println();
		System.out.printf("O per�metro do ret�ngulo � igual a %2.4f " ,perimetro);
		System.out.println();
		System.out.printf("A diagonal do ret�ngulo � igual a %2.4f " , diagonal);
		
	
		

	}

}
