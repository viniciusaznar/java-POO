import java.util.Locale;
import java.util.Scanner;

public class Main_entrada_string {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//PRINTANDO STRING:
		
		String x_string;
		
		x_string = sc.next();
		System.out.println("Você digitu: " + x_string);
		
		sc.close();	

	}

}
