
public class Main_string_replace_char {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG		";
		
		String original_replace = original.replace('a', 'x');
		
		System.out.println("ORIGINAL: -" + original + "-");
		System.out.println(
				"FUNCAO '.replace();': -" + original_replace + "-"
				);

	}

}
