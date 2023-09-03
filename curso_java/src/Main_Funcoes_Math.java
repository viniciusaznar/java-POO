import java.util.Locale;
import java.util.Scanner;

public class Main_Funcoes_Math {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A1, B1, C1;
		
		A1 = Math.sqrt(x);
		B1 = Math.sqrt(y);
		C1 = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A1);
		System.out.println("Raiz quadrada de " + x + " = " + B1);
		System.out.println("Raiz quadrada de 25 = " + C1);
		
		A1 = Math.pow(x, y);
		B1 = Math.pow(x, 2.0);
		C1 = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A1);
		System.out.println(x + " elevado ao quadro = " + A1);
		System.out.println("5 elevado ao quadrado = " + C1);
		
		A1 = Math.abs(y);
		B1 = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A1);
		System.out.println("Valor absoluto de " + z + " = " + B1);
		
		// Bhaskara
		
		double a, b, c, delta, x1, x2;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.printf("x1 = %.f%n", x1);
		System.out.printf("x1 = %.f%n", x2);
		
		sc.close();
	}

}
