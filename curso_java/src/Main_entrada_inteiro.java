import java.util.Locale;
import java.util.Scanner;

public class Main_entrada_inteiro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//PRINTANDO VALOR INTEIRO:
		
		int x_inteiro;
		
		x_inteiro = sc.nextInt();
		
		System.out.println("Você digitu: " + x_inteiro);
		
		sc.close();
	}

}
