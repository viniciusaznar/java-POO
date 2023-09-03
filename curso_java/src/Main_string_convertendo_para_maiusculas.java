
public class Main_string_convertendo_para_maiusculas {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG		";
		
		String original_maiuscula = original.toUpperCase();
		
		System.out.println("ORIGINAL: -" + original + "-");
		System.out.println(
				"FUNCAO '.toUpperCase();': -" 
						+ original_maiuscula + "-"
				);

	}

}
