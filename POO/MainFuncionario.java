package applicationPOO;

import java.util.Scanner;

import entitiesPOO.Funcionario;

/*Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto).
 * Em seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida,
 * aumentar o sal�rio do funcion�rio com base em uma porcentagem dada (s� afeta salario bruto)
 * e mostrar novamente os dados do funcion�rio.
 */

public class MainFuncionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Funcionario func = new Funcionario();

		System.out.println("Nome: ");
		func.nome = leia.next();
		System.out.println("Salario Bruto: ");
		func.salarioBruto = leia.nextDouble();
		System.out.println("Imposto: ");
		func.imposto = leia.nextDouble();
		
		System.out.println(func.salarioBruto);
		
		
		
		System.out.println("Funcion�rio:" + func);
		
		
		
		
		System.out.println("Qual porcentagem que deseja aumentar o sal�rio?");
		double porcentagem = leia.nextDouble();
		func.aumentosalario(porcentagem);
		
		
		System.out.println("Update: " + func);
		
		
		
	}

}
