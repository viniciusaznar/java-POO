/*
 
FONTE: 02-exercicios1-estrutura-sequencial.pdf

EXERCICIO B (01000010):
	
	#	Faça um programa para ler o valor do raio de um círculo, 
		e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		
		 */


import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double area;
		
		// 	Considere o valor de π = 3.14159
		double pi;
		
		double raio;
		
		pi = 3.14159;
		raio = sc.nextDouble();
		
		//	Fórmula da área: area = π . raio2
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f%n", area);
		                
		sc.close();

	}

}
