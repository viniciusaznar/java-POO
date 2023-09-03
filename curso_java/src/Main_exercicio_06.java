/*
 
FONTE: 02-exercicios1-estrutura-sequencial.pdf

EXERCICIO E (01000101):
	
	#	Fazer um programa para ler o código de uma peça 1,
	 	o número de peças 1, o valor unitário de cada peça 1,
	 	o código de uma peça 2, o número de peças 2 e 
	 	o valor unitário de cada peça 2. 
	 	Calcule e mostre o valor a ser pago.
		
		 */

import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade_peca_1, quantidade_peca_2, id_peca_1, id_peca_2;
		
		double total_valor_peca_1, uni_valor_peca_1, 
		total_valor_peca_2, uni_valor_peca_2, total_pagamento;
		
		id_peca_1 = sc.nextInt();
		quantidade_peca_1 = sc.nextInt();
		uni_valor_peca_1 = sc.nextDouble();		
		total_valor_peca_1 = quantidade_peca_1 * uni_valor_peca_1;
		
		id_peca_2 = sc.nextInt();
		quantidade_peca_2 = sc.nextInt();
		uni_valor_peca_2 = sc.nextDouble();		
		total_valor_peca_2 = quantidade_peca_2 * uni_valor_peca_2;
		
		total_pagamento = total_valor_peca_1 + total_valor_peca_2;
		
		System.out.println(id_peca_1);
		System.out.println(quantidade_peca_1);
		System.out.println(uni_valor_peca_1);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total_pagamento);		
		
		System.out.println(id_peca_2);
		System.out.println(quantidade_peca_2);
		System.out.println(uni_valor_peca_2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total_pagamento);	
		
		sc.close();
		
	}

}
