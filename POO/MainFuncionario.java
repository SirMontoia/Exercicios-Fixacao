package applicationPOO;

import java.util.Scanner;

import entitiesPOO.Funcionario;

/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto).
 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida,
 * aumentar o salário do funcionário com base em uma porcentagem dada (só afeta salario bruto)
 * e mostrar novamente os dados do funcionário.
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
		
		
		
		System.out.println("Funcionário:" + func);
		
		
		
		
		System.out.println("Qual porcentagem que deseja aumentar o salário?");
		double porcentagem = leia.nextDouble();
		func.aumentosalario(porcentagem);
		
		
		System.out.println("Update: " + func);
		
		
		
	}

}
