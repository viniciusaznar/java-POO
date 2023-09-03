
public class Main_string_criar_nova_string_do_indice_caractere_escolhido {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG		";
		
		String original_substring = original.substring(2);
		
		System.out.println("ORIGINAL: -" + original + "-");
		System.out.println(
				"FUNCAO '.substring(2);': -" + original_substring + "-"
				);

	}

}
