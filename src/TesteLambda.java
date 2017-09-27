import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambda {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("teste");
		palavras.add("testee");
		palavras.add("testeeee");

		// System.out.println(palavras);

		palavras.forEach((s) -> System.out.println(s));
		palavras.forEach(System.out::println);
		//Isso é um lambda
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		System.out.println(palavras);
		//Isso é um metodo reference
		palavras.sort(Comparator.comparing(String::length));
		System.out.println(palavras);
//		
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Executando um Runnable");
//			}
//
//		}).start();
//		
//		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}

}
