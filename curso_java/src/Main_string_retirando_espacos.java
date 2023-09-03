
public class Main_string_retirando_espacos {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG		";
		
		String original_trim = original.trim();
		
		System.out.println("ORIGINAL: -" + original + "-");
		System.out.println(
				"FUNCAO '.trim();': -" + original_trim + "-"
				);

	}

}
