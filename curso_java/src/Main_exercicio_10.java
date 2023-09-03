/*
 
FONTE: 02-exercicios2-estrutura-condicional.pdf

EXERCICIO I (01001001):
	
	#	Leia 2 valores inteiros (A e B). 
		Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
		ou "Nao sao Multiplos", 
		indicando se os valores lidos são múltiplos entre si. 
		Atenção: os números devem poder ser digitados 
		em ordem crescente ou decrescente.

		 */

import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_10 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A;
		int B;
		int troca;
		
		System.out.println("Digite o primeiro numero: ");
		A = sc.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		B = sc.nextInt();
		
		if (A < B) {
			troca = A;
			A = B;
			B = troca;
		}
	
		if (A % B == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}	
		
		
		sc.close();

	}

}
