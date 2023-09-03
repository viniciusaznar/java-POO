/* 
 
 - PROBLEMA "NEGATIVO":
 
 	# Faça um programa que leia 
 	um número inteiro positivo N (máximo = 10) e 
 	depois N números inteiros e armazene-os em um vetor. 
 	Em seguida, mostrar na tela todos os números negativos lidos.

 */



import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_27 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		double maiorValor = 0;
		int posicao = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();

		}

		// Comparar o maior valor dentro de um vetor
		for (int i = 1; i < vect.length; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicao = i;
			}
		}

		System.out.println();
		System.out.printf("MAIOR VALOR = %.2f%n", maiorValor);
		System.out.printf("POSICAO DO MAIOR VALOR = " + posicao);
		sc.close();

	}
}
