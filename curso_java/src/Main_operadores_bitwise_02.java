import java.util.Scanner;
import java.util.Locale;

public class Main_operadores_bitwise_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) 
		{
			System.out.println("6th bit is True!");
		} 
		else
		{
			System.out.println("6th bit is False!");
		}
		
		sc.close();
		

	}

}
