/*
 
FONTE: 02-exercicios2-estrutura-condicional.pdf

EXERCICIO H (01001000):
	
	#	Fazer um programa para ler um número inteiro 
		e dizer se este número é par ou ímpar.

		 */

import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Digite um numero inteiro: ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();
		
		
	}

}
