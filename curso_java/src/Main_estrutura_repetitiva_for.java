import java.util.Scanner;

public class Main_estrutura_repetitiva_for {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		
		}
		
		System.out.println("CONTAGEM INVERSA");
		for (int j = 4; j >= 0; j--) {
			System.out.println("Valor de j: " + j);
			
		}
		
		sc.close();

	}

}
