
public class Main_string_recortar_indice_inicio_fim {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG		";
		
		String original_substring_indice = original.substring(2, 9);
		
		System.out.println("ORIGINAL: -" + original + "-");
		System.out.println(
				"FUNCAO '.substring(2, 9);': -" + original_substring_indice + "-"
				);

	}

}
