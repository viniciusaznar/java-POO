import java.util.Locale;
import java.util.Scanner;

public class Main_entrada_char {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	
		//PRINTANDO VALOR CHAR:
		
		double x_char;
		
		x_char = sc.next().charAt(0);
		
		System.out.println("Você digitu: " + x_char);		
		
		sc.close();

	}

}
