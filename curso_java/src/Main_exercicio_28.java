import java.util.Locale;
import java.util.Scanner;

public class Main_exercicio_28 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros ira digitar? ");
		int N = sc.nextInt();
		int vect[] = new int[N];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();

		}

		System.out.println("NUMEROS NEGATIVOS:");

		for (int i = 0; i < N; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();

	}

}
