
public class Main_replace_substring {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG		";
		
		String original_replace_substring = original.replace("abc", "xy");
		
		System.out.println("ORIGINAL: -" + original + "-");
		System.out.println(
				"FUNCAO '.replace();': -" + original_replace_substring + "-"
				);

	}

}
