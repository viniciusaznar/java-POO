import java.util.Locale;
				
public class Main {
		

			public static void main(String[] args) {
				
				int y = 32;		//	Declarando uma variável do tipo 'int'
				
				double x = 10.35784;		//	Declarando uma variável do tipo 'double'
				
				System.out.println(x);		//	Chamando uma variável
				
				System.out.printf("%.2f%n", x);		//	Formatando as casas decimais de um número 'float' [PRINTF]
				
				System.out.println(y);
				System.out.println();
				
				System.out.println("PRINTLN -> Com quebra de linha: ");		//	Printando com quebra de linha [PRINTLN]
				System.out.println("Olá, Mundo!");
				System.out.println("Bom dia!");
				System.out.println();
				
				System.out.println("PRINT -> Sem quebra de linha: ");		//	Printando sem quebra de linha [PRINT]
				System.out.print("Olá, mundo!");
				System.out.print("Bom dia!");
				System.out.println();
			
				Locale.setDefault(Locale.US);		//	Configurando a localização do aplicativo
				System.out.printf("%.4f%n", x);
				System.out.println();
				
				System.out.println("RESULTADO = " + x + " METROS");		//	Concatenando texto e variáveis.
				System.out.printf("RESULTADO = %.2f METROS%n", x);		//	Concatenando texto e variáveis com o 'printf'
				System.out.println();
				
				String nome = "Maria";
				int idade = 31;
				double renda = 4000.0;
				System.out.printf("%s tem %d de idade e recebe %f reais%n", nome, idade, renda);
			}

}
