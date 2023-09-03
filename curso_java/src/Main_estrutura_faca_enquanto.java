import java.util.Scanner;
import java.util.Locale;

public class Main_estrutura_faca_enquanto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			
			System.out.print("Digite a temperatura em Celsius:");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Temperatra equivalete em Fahreheit: %.1f%n", F);
			System.out.print("Deseja repetir: [s/n]? ");
			resp = sc.next().charAt(0);
			
		} while (resp != 'n');
		
		sc.close();

	}

}
