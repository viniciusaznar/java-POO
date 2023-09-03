/*
 
FONTE: 02-exercicios1-estrutura-sequencial.pdf

EXERCICIO C (01000011):
	
	#	Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		A seguir, calcule e mostre a diferença do produto de A e B 
		pelo produto de C e D segundo a fórmula: 
		
		DIFERENCA = (A * B - C * D).
		
		 */

import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = (A * B) - (C * D);
		
		System.out.printf("DIFERENCA = %d%n", diferenca);
		
		
		sc.close();

	}

}
