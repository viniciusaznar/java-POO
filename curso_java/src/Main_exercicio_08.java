/*
 
FONTE: 02-exercicios2-estrutura-condicional.pdf

EXERCICIO G (01000111):
	
	#	Fazer um programa para ler um número inteiro, 
		e depois dizer se este número é negativo ou não.

		 */

import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_08 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}
		
		sc.close();

	}

}
