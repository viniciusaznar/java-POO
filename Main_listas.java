import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Main_listas {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		
		/* list.add(); */
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		
		/* list.add("posicao", "elemento"); */
		list.add(2, "Marco");
		/* ADICIONANDO PELA POSICAO E ELEMENTO */
		
		
		/* ADICIONADO ITENS NA LISTA */
			
		
		/* list.size(); */
		System.out.println(list.size());
		/* MOSTRAND O TAMANHO DA LISTA */
			
		
		/* list.remove() */
		list.remove("Anna");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		/* REMOVENDO ITEM DA LISTA */
			
			
		/* for/each */
		for (String x : list) {
			System.out.println(x);
		}
		/* PERCORRENDO A LISTA */			
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		List<String> list1 = new ArrayList<>();
		
		list1.add("Maria");
		list1.add("Alex");
		list1.add("Bob");
		list1.add("Anna");
		
		for (String x : list1) {
			System.out.println(x);
		}
		
		System.out.println("Index of Bob: " + list1.indexOf("Bob"));
		System.out.println("Index of Marco: " + list1.indexOf("Marco"));
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		List<String> result = list1.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		String name = list1.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		}
		
		
	}

