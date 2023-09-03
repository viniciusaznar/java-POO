/*
 
FONTE: 02-exercicios3-estrutura-while.pdf

EXERCICIO P (01010000) :
	
	#	Escreva um programa para ler as coordenadas (X,Y) 
		de uma quantidade indeterminada de pontos no sistema cartesiano. 
		Para cada ponto escrever o quadrante a que ele pertence. 
		O algoritmo será encerrado quando pelo menos uma de duas coordenadas 
		for NULA (nesta situação sem escrever mensagem alguma).
		
		 */

import java.util.Scanner;

public class Main_exercicio_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a coordenada de X:");
		double x = sc.nextDouble();
		System.out.println("Digite a coordenada de Y:");
		double y = sc.nextDouble();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro. QUADRANTE 1 (Q1).");
				System.out.println("Digite a coordenada de X:");
				x = sc.nextDouble();
				System.out.println("Digite a coordenada de Y:");
				y = sc.nextDouble();
			
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo. QUADRANTE 2 (Q2).");
				System.out.println("Digite a coordenada de X:");
				x = sc.nextDouble();
				System.out.println("Digite a coordenada de Y:");
				y = sc.nextDouble();
				
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro. QUADRANTE 3 (Q3).");
				System.out.println("Digite a coordenada de X:");
				x = sc.nextDouble();
				System.out.println("Digite a coordenada de Y:");
				y = sc.nextDouble();
			
			} else {
				System.out.println("Quarto. QUADRANTE 4 (Q4).");
				System.out.println("Digite a coordenada de X:");
				x = sc.nextDouble();
				System.out.println("Digite a coordenada de Y:");
				y = sc.nextDouble();
				
			}
		}
		
		sc.close();
		

	}

}
