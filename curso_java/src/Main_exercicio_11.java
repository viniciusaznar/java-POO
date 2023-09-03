/*
 
FONTE: 02-exercicios2-estrutura-condicional.pdf

EXERCICIO J (01001010):
	
	#	Leia a hora inicial e a hora final de um jogo. 
		A seguir calcule a duração do jogo, 
		sabendo que o mesmo pode começar em um dia e terminar em outro, 
		tendo uma duração mínima de 1 hora e máxima de 24 horas.

		 */

import java.util.Scanner;

public class Main_exercicio_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hora_inicial;
		int hora_final;
		int duracao_jogo;
		
		System.out.println("Digite a hora inicial: ");
		hora_inicial = sc.nextInt();
		
		System.out.println("Digite a hora final: ");
		hora_final = sc.nextInt();
		
		if (hora_inicial >= hora_final) {
			duracao_jogo = 24 - (hora_inicial - hora_final);
		} else {
			duracao_jogo = (hora_final - hora_inicial);
		}
		
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao_jogo);		
		
		sc.close();

	}

}
