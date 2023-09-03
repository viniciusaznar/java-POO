
public class Main_index_ocorrencia {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG		";
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("ORIGINAL: -" + original + "-");
		System.out.println(
				"FUNCAO '.indexOf(); " + i);
		System.out.println(
				"FUNCAO '.lastIndexOf(); " + j);
	}

}