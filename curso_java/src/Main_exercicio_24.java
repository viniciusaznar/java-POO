/*
 
FONTE: 02-exercicios4-estrutura-for.pdf

EXERCICIO X (01011000) :
	
	#	Ler um número inteiro N e calcular todos os seus divisores.
		
		 */

import java.util.Scanner;

public class Main_exercicio_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
