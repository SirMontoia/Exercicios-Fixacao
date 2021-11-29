package applicationPOO;

import java.util.Scanner;

import entitiesPOO.Aluno;

/* Fazer um programa para ler o nome de um aluno e três notas que ele obteve nos 3
 * trimestres do ano (primeiro vale 30 e os outros 2 valem 35 cada). Ao final, mostrar
 * qual a nota final do aluno no ano. Dizer também se o aluno está aprovado (PASS)
 * ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o 
 * mínimo para ser aprovado (60% da nota).
 */

public class MainAluno {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Aluno al = new Aluno();
		
		System.out.println("Entre com o nome e as 3 notas");
		al.nome = leia.next();
		al.nota1= leia.nextDouble();
		al.nota2= leia.nextDouble();
		al.nota3= leia.nextDouble();
		
		al.calculonota();
		
		
		
		if(al.calculonota() > 60) {
			System.out.printf("FINAL GRADE = %2.2f" , al.calculonota());
			System.out.println ();
			System.out.println("PASS");
		}else {
			al.aproximarnota();
			System.out.printf ("FINAL GRADE = %2.2f " , al.calculonota());
			System.out.println();
			System.out.println ("FAILED");
			System.out.printf ("MISSING %2.2f POINTS" , al.aproximarnota());
			
		}
		
	}

}
