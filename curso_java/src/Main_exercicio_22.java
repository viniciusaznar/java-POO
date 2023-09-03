/*
 
FONTE: 02-exercicios4-estrutura-for.pdf

EXERCICIO U (01010101) :
	
	#	Fazer um programa para ler um número N. 
		Depois leia N pares de números e mostre 
		a divisão do primeiro pelo segundo. 
		Se o denominador for igual a zero, mostrar a mensagem 
		"divisao impossivel".
		
		 */


import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_22 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
	}
}