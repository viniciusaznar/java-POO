/*
 
FONTE: 02-exercicios1-estrutura-sequencial.pdf

EXERCICIO A (01000001):
	
	#	Faça um programa para ler dois valores inteiros, 
		e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.
		
	#	Exemplos:
	
		- 	Entrada:
			10
			30
			
			Saída:
			SOMA = 40
			
		 */


import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		int soma;
		
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
