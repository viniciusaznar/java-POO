/*
 
FONTE: 02-exercicios1-estrutura-sequencial.pdf

EXERCICIO D (01000100):
	
	#	Fazer um programa que leia o número de um funcionário, 
		seu número de horas trabalhadas, o valor que recebe 
		por hora e calcula o salário desse funcionário. 
		A seguir, mostre o número e o salário do funcionário, 
		com duas casas decimais.
		
		 */

import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		double worked_hours;
		double hours_value;
		double salary;
		
		number = sc.nextInt();
		worked_hours = sc.nextDouble();
		hours_value = sc.nextDouble();
		
		salary = worked_hours * hours_value;
		
		System.out.printf("NUMBER = %d%n", number);
		System.out.printf("SALARY = %.2f%n", salary);		
		
		
		sc.close();
		

	}

}
