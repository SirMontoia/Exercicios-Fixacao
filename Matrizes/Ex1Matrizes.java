package matrizes;

import java.util.Scanner;

/*Fazer um programa para ler dois números inteiros M e N e depois ler
 * uma matriz de M linhas por N colunas contendo números inteiros,
 * podendo haver repetições. Em seguida, ler um número inteiro x que, 
 * pertence á matriz. Para cada ocorrência de X, mostrar os valores
 * à esquerda, acima, à direita e abaixo de X, quando houver.
 */

public class Ex1Matrizes {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int m, n, valor;
		
		System.out.println("Entre com a quantidade de linhas da matriz : ");
		m = read.nextInt();
		
		System.out.println("Entre com a quantidade de colunas da matriz: ");
		n = read.nextInt();
		
		int [][] matriz = new int[m][n]; 
		
		
		for (int i =0 ; i<m ; i++) {
			for (int j =0 ; j<n ; j++) {
				System.out.println("Entre com os valores da matriz: ");
				matriz[i][j] = read.nextInt();
			}
		}
		
		System.out.println("Entre com o valor para mapear seu entorno");
		valor = read.nextInt();
		
		
		for (int i =1 ; i<=m ; i++) {
			for (int j =1 ; j<=n ; j++) {
				if (matriz[i][j] == valor) {
					System.out.println("Position" + i + "," + j);
					System.out.println("Left: " + matriz[i][j-1]);
					System.out.println("Right: " + matriz[i][j+1]);
					System.out.println("Up: " + matriz[i-1][j]);
					System.out.println("Down: " + matriz[i+1][j]);
				}
			}
		}
	
		
		
		/*CORREÇÃO
		 * for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] == valor) {
					System.out.println("Position " + i + "," + j + ":");
					
					if (j > 0) ---> GARANTIR QUE NÃO CAIA EM POSIÇÃO NEGATIVA {
						System.out.println("Left: " + mat[i][j-1]);
					}
					
					if (i > 0) ---> GARANTIR QUE NÃO CAIA EM POSIÇÃO NEGATIVA {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if (j < mat[i].length-1) ---> GARANTIR QUE NÃO CAIA EM POSIÇÃO MAIOR QUE O LIMITE {
						System.out.println("Right: " + mat[i][j+1]);
					}
					
					if (i < mat.length-1) ---> GARANTIR QUE NÃO CAIA EM POSIÇÃO MAIOR QUE O LIMITE {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		 */
		
		
		
	}

}
