/*
 
FONTE: 02-exercicios3-estrutura-while.pdf

EXERCICIO O (01001111) :
	
	#	Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
		Para cada leitura de senha incorreta informada, 
		escrever a mensagem "Senha Invalida". 
		Quando a senha for informada corretamente deve ser impressa 
		a mensagem "Acesso Permitido" e o algoritmo encerrado. 
		Considere que a senha correta é o valor 2002.
		
		 */

import java.util.Scanner;

public class Main_exercicio_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha_correta = 2002;
		
		System.out.println("Insira a Senha: ");
		int senha_input = sc.nextInt();
		
		while (senha_input != senha_correta) {
			System.out.println("Senha Inválida.");
			System.out.println("Insira a Senha: ");
			senha_input = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido.");
		
		sc.close();

	}

}
