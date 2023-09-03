/* 
 
 PROBLEMA "SOMA VETOR"
 
 	# Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
		- Imprimir todos os elementos do vetor
		- Mostrar na tela a soma e a média dos elementos do vetor
 
 * */

import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_29 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros ira digitar? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}

		double media = soma / N;

		System.out.println();
		System.out.print("VALORES = ");

		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", vect[i]);
		}

		System.out.printf("\nSOMA = %.2f\n", soma);
		System.out.printf("MEDIA = %.2f\n", media);

		sc.close();

	}

}
