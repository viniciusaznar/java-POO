

public class Main_processamento_casting {

	public static void main(String[] args) {

		// EXEMPLO 1 & 2:

		int x;
		double y;
		
		x = 5;
		
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		// EXEMPLO 3 - AREA DO TRAPEZIO:
		
		double baseMenor, baseMaior, altura, area;
		
		baseMenor = 6.0;
		baseMaior = 8.0;
		altura = 5.0;
		
		area = ((baseMenor + baseMaior) / 2) * altura;
		
		System.out.println(area);
		
		
		// EXEMPLO 4:
		
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		
		System.out.println(resultado);
		
		
		// EXEMPLO 5:
		
		
		double a1;
		int b1;
		
		a1 = 5.0;
		b1 = (int) a1;
		
		System.out.println(b1);
	}

}
