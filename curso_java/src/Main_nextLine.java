import java.util.Scanner;

public class Main_nextLine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x;
		
		String s1, s2, s3;
		
		x = sc.nextInt();
		// Limpando o buffer de leitura:
		sc.nextLine();
		//
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(x);
		
		sc.close();
		

	}

}
