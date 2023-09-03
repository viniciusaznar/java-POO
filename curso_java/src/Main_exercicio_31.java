import java.util.Scanner;

public class Main_exercicio_31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro numero: ");
		int M = sc.nextInt();
		System.out.print("Digite o segundo numero: ");
		int N = sc.nextInt();

		int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			System.out.printf("Digite %d numeros: \n", N);
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Digite o valor de X: ");
		int x = sc.nextInt();

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (x == mat[i][j]) {
					System.out.println("Position: " + i + ", " + j + ": ");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}

		
		
		sc.close();

	}

}
