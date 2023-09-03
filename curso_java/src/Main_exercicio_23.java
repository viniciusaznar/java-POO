/*
 
FONTE: 02-exercicios4-estrutura-for.pdf

EXERCICIO V (01010110) :
	
	#	Ler um valor N. Calcular e escrever seu respectivo fatorial. 
		Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		Lembrando que, por definição, fatorial de 0 é 1.
		
		 */

import java.util.Scanner;

public class Main_exercicio_23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int fatorial = 1;
		
		for (int i = 1; i <= N; i++) 
		{
			fatorial *= i;			
		}
		
		System.out.println(fatorial);
		
		sc.close();

	}

}
