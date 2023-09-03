/*
 
FONTE: 02-exercicios4-estrutura-for.pdf

EXERCICIO R (01010010) :
	
	#	Leia um valor inteiro X (1 <= X <= 1000). 
		Em seguida mostre os ímpares de 1 até X, um valor por linha, 
		inclusive o	X, se for o caso.
		
		 */

import java.util.Scanner;

public class Main_exercicio_19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int N = sc.nextInt();


			for (int i = 0; i < N; i++) {
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}

		sc.close();

	}

}
