import java.util.Locale;
import java.util.Scanner;

public class Main_atribuicao_cumulativa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos_consumidos, pacote_minutos;
		double conta;
		
		conta = 50.0;
		pacote_minutos = 100;
		System.out.println("Quantidade de  minutos utilizada: ");
		minutos_consumidos = sc.nextInt();
		
		if (minutos_consumidos > pacote_minutos) {
			conta += (minutos_consumidos - pacote_minutos) * 2.0;
			System.out.printf("Valor a pagar: %.2f%n", conta);
			
		} else {
			System.out.printf("Valor a pagar: %.2f%n", conta);
			
		}
		
		sc.close();

	}

}
