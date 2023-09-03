/*
 
FONTE: 02-exercicios2-estrutura-condicional.pdf

EXERCICIO K (01001011):
	
	#	Escreva um programa que leia o código de um item 
		e a quantidade deste item. A seguir, calcule e mostre o valor 
		da conta a pagar.
		
		 */


import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int	input_id_item, id_item_1, id_item_2, id_item_3,
			id_item_4, id_item_5, quantidade;
			
		String	describe_item_1, describe_item_2, describe_item_3,
				describe_item_4, describe_item_5;
		
		double	value_item_1, value_item_2, value_item_3, value_item_4,
				value_item_5, total;
		
		
		id_item_1 = 1;
		id_item_2 = 2;
		id_item_3 = 3;
		id_item_4 = 4;
		id_item_5 = 5;
		
		describe_item_1 = "CACHORRO QUENTE";
		describe_item_2 = "X-SALADA";
		describe_item_3 = "X-BACON";
		describe_item_4 = "TORRADA SIMPLES";
		describe_item_5 = "REFRIGERANTE";
		
		value_item_1 = 4.00;
		value_item_2 = 4.50;
		value_item_3 = 5.00;
		value_item_4 = 2.00;
		value_item_5 = 1.50;
		
		
		System.out.println("Qual o codigo do item? ");
		input_id_item = sc.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = sc.nextInt();
	
		
		if (input_id_item == id_item_1) {
			
			System.out.println(describe_item_1);
			System.out.printf("VALOR UNITÁRIO: %.2f%n", value_item_1);
			System.out.printf("QUANTIDADE SOLICITADA: %d%n", quantidade);

			total = value_item_1 * quantidade;
			System.out.printf("TOTAL: R$ %.2f%n", total);
			
		} else if (input_id_item == id_item_2) {
			
			System.out.println(describe_item_2);
			System.out.printf("VALOR UNITÁRIO: %.2f%n", value_item_2);
			System.out.printf("QUANTIDADE SOLICITADA: %d%n", quantidade);

			total = value_item_2 * quantidade;
			System.out.printf("TOTAL: R$ %.2f%n", total);
			
		} else if (input_id_item == id_item_3) {
			
			System.out.println(describe_item_3);
			System.out.printf("VALOR UNITÁRIO: %.2f%n", value_item_3);
			System.out.printf("QUANTIDADE SOLICITADA: %d%n", quantidade);

			total = value_item_3 * quantidade;
			System.out.printf("TOTAL: R$ %.2f%n", total);
			
		} else if (input_id_item == id_item_4) {
			
			System.out.println(describe_item_4);
			System.out.printf("VALOR UNITÁRIO: %.2f%n", value_item_4);
			System.out.printf("QUANTIDADE SOLICITADA: %d%n", quantidade);

			total = value_item_4 * quantidade;
			System.out.printf("TOTAL: R$ %.2f%n", total);
			
		} else if (input_id_item == id_item_5) {
			
			System.out.println(describe_item_5);
			System.out.printf("VALOR UNITÁRIO: %.2f%n", value_item_5);
			System.out.printf("QUANTIDADE SOLICITADA: %d%n", quantidade);

			total = value_item_5 * quantidade;
			System.out.printf("TOTAL: R$ %.2f%n", total);
			
		}
		
		sc.close();

	}

}
