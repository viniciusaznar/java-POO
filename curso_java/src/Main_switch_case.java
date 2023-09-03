import java.util.Scanner;

public class Main_switch_case {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero de 1 a 6: ");
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-feira";
			break;
		case 3:
			dia = "Terça-feira";
			break;
		case 4:
			dia = "Quarta-feira";
			break;
		case 5:
			dia = "Sexta-feira";
			break;
		case 6:
			dia = "Sábado;";
			break;
		default:
			dia = "Valor Inválido";
			break;
		}

		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
