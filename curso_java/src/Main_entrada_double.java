import java.util.Locale;
import java.util.Scanner;

public class Main_entrada_double {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	
		//PRINTANDO VALOR DOUBLE:
		
		double x_double;
		
		x_double = sc.nextDouble();
		
		System.out.println("Você digitu: " + x_double);		
		
		sc.close();

	}

}
