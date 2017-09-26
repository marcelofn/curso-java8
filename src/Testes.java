import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Testes {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("alguma coisa");
		palavras.add("outra coisa");
		palavras.add("chega de palavras");

		System.out.println(palavras);

		Collections.sort(palavras);

		System.out.println(palavras);

		// Lambda
		palavras.forEach(s -> System.out.println(s));
		// Lambda
		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length()) {
				return -1;
			}
			if (s1.length() > s2.length()) {
				return 1;
			}
			return 0;
		});
		System.out.println(palavras);

		// Lambda menor ainda
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Executando um Runnable");
			}

		}).start();

		new Thread(() -> System.out.println("Executando um Runnable")).start();

	}

}
