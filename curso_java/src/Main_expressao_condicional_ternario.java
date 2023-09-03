import java.util.Scanner;

public class Main_expressao_condicional_ternario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		
		// Expressao ternaria que pode substituir o 'if'
		
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		/*
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;	
		}
		
		 */	
		
		System.out.println(desconto);
		
		sc.close();
		

	}

}
 