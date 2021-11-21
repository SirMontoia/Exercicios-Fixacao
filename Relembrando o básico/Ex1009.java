package Uri1001;

import java.util.Scanner;

/*Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money). 
 * Considering that this seller receives 15% over all products sold, write the final salary (total) of this seller at the end of the month , with two decimal places.

- Don’t forget to print the line's end after the result, otherwise you will receive “Presentation Error”.

- Don’t forget the blank spaces.

Input
The input file contains a text (employee's first name), and two double precision values, that are the seller's salary and the total value sold by him/her.

Output
Print the seller's total salary, according to the given example.*/



public class Ex1009 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		  
	  	String nome;
	  	double salariofixo;
	  	double totalvendas;
	    double comissao;
	  	double salariototal;
	  
	  	System.out.println ("Entre com seu nome por gentileza");
	  	nome = leia.nextLine();
	  	System.out.println ("Entre com seu salario fixo por gentileza");
	  	salariofixo = leia.nextDouble();
	  	System.out.println ("Entre com seu total de vendas por gentileza");
	  	totalvendas = leia.nextDouble();
	  
	  	comissao = totalvendas*0.15;
	  	salariototal = comissao + salariofixo;
	  
	  	System.out.printf(" O (A) funcionario(a) em questão recebeu, no final do mês, um total de %3.2f" , salariototal);
		
	  	
	  	
	  	
	  	
	  	
		
		
		
		}

}
