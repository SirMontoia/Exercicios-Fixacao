package Exerc�ciosExtras;

import java.util.Scanner;

/*Problema "duracao"
Fazer um programa para ler uma dura��o de tempo em segundos, da� imprimir na tela esta dura��o no
formato horas:minutos:segundos.*/


public class Relembrando8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int segundosInformados, segundosTotais, minutos, horas;
		
		System.out.println("Quantos segundos o evento durou?");
		segundosInformados = leia.nextInt();
		
		horas = segundosInformados / 3600;
		
		minutos = (segundosInformados % 3600) / 60;
		
		segundosTotais = (segundosInformados % 3600) % 60;
		
		System.out.println("O evento teve dura��o igual a : " + horas +":" + minutos + ":" + segundosTotais);
		

	}

}
