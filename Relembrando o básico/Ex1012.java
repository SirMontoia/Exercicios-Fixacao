package Uri1001;

import java.util.Scanner;




public class Ex1012 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		double a, b, c, areaa, areab, areac, aread, areae;
		
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Entre com o valor de B: ");
		b= leia.nextDouble();
		System.out.println("Entre com o valor de C: ");
		c = leia.nextDouble();
		
		areaa = (a*c)/2;
		areab = (3.14159*Math.pow(c, 2));
		areac = ((a+b)/2)*c;
		aread = Math.pow(b, 2);
		areae = a*b;
		
		System.out.printf("TRIÂNGULO: %2.3f", areaa);
		System.out.println();
		System.out.printf("CÍRCULO: %2.3f", areab);
		System.out.println();
		System.out.printf("TRAPÉZIO: %2.3f", areac);
		System.out.println();
		System.out.printf("QUADRADO: %2.3f", aread);
		System.out.println();
		System.out.printf("RETÂNGULO: %2.3f", areae);
		
		
		

	}

}
