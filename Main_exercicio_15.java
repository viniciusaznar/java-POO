/*
 
FONTE: 02-exercicios2-estrutura-condicional.pdf

EXERCICIO N (01001110):
	
	#	Em um país imaginário denominado Lisarb, 
		todos os habitantes ficam felizes em pagar seus impostos, 
		pois sabem os recursos arrecadados são utilizados 
		em benefício da população, sem qualquer desvio. 
		A moeda deste país é o Rombus, cujo símbolo é o R$.
		Leia um valor com duas casas decimais, 
		equivalente ao salário de uma pessoa de Lisarb. 
		Em seguida, calcule e mostre o valor que esta pessoa 
		deve pagar de Imposto de Renda.
	
	#	Lembre que, se o salário for R$ 3002.00, 
		a taxa que incide é de 8% apenas sobre R$ 1000.00, 
		pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é 
		isenta de Imposto de Renda. No exemplo fornecido (abaixo), 
		a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, 
		o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		duas casas decimais.
		
		 */

import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_15 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto_renda;
		
		System.out.println("Digite o valor do salário: ");
		salario = sc.nextDouble();
		
		if (salario >= 0 && salario <= 2000.0) {
			System.out.println("Isento. ");
			
		} else if (salario >= 2000.01 && salario <= 3000.0) {
			imposto_renda = (salario - 2000.01) * 8 / 100;
			System.out.printf("R$ %.2f%n", imposto_renda);
			
		} else if (salario >= 3001.0 && salario < 4500.0){
			imposto_renda = ((salario - 2000.01) * 8 / 100) +
			((salario - 3000.01) * 18 / 100);
			System.out.printf("R$ %.2f%n", imposto_renda);
			
		} else {
			imposto_renda = ((salario - 2000.0) * 8 / 100) +
			((salario - 3000.0) * 18 / 100) + 
			((salario - 4500.0) * 28 / 100);
			System.out.printf("R$ %.2f%n", imposto_renda);
			
		}
		
		sc.close();

	}

}
