/*
 
FONTE: 02-exercicios1-estrutura-sequencial.pdf

EXERCICIO F (01000110):
	
	#	Fazer um programa que leia três valores 
		com ponto flutuante de dupla precisão: A, B e C. 
		
		Em seguida, calcule e mostre:
		
			a) a área do triângulo retângulo que tem A por base e C por altura.
			b) a área do círculo de raio C. (pi = 3.14159)
			c) a área do trapézio que tem A e B por bases e C por altura.
			d) a área do quadrado que tem lado B.
			e) a área do retângulo que tem lados A e B.
		 */

import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double	A, B, C, pi,
				a_triangulo_retangulo, a_circulo, a_trapezio, 
				a_quadrado, a_retangulo;
		
		pi = 3.14159;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		a_triangulo_retangulo = (A * C) / 2;
		a_circulo = pi * Math.pow(C, 2);
		a_trapezio = ((A + B) * C) / 2;
		a_quadrado = Math.pow(B, 2);
		a_retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", a_triangulo_retangulo);
		System.out.printf("CIRCULO: %.3f%n", a_circulo);
		System.out.printf("TRAPEZIO: %.3f%n", a_trapezio);
		System.out.printf("QUADRADO: %.3f%n", a_quadrado);
		System.out.printf("RETANGULO: %.3f%n", a_retangulo);		
		
		sc.close();

	}

}
