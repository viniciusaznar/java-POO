
public class Main_operadores_bitwise_01 {

	public static void main(String[] args) {

		/* OPERADOR & (E):

			#	n1		n2		n1		&		n2
		 		F		F				F
		 		F		V				F
		 		V		F				F
		 		V		V				V
		 
		 OPERADOR | (OU):

			#	n1		n2		n1		|		n2
		 		F		F				F
		 		F		V				V
		 		V		F				V
		 		V		V				V
		 		
		 OPERADOR ^ (OU-EXCLUSIVO):

			#	n1		n2		n1		XOR		n2
		 		F		F				F
		 		F		V				V
		 		V		F				V
		 		V		V				F
		 		
		 */
		
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
	}

}
