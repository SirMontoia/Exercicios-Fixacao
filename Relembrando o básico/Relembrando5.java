package ExercíciosExtras;


import java.util.Scanner;

public class Relembrando5 {

	/*Problema "circulo"
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
círculo com três casas decimais.. Você pode
usar o valor de pi  fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
diretamente o valor 3.14159.*/
	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float raio, area;
		
		System.out.println("Informe o valor do raio");
		raio = leia.nextFloat();
		
		area = (float) (3.14159* Math.pow(raio, 2));
		
		System.out.printf("A área do círculo em questão é %2.3f" , area);
		
		

	}

}
