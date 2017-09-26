import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

		palavras.forEach(s -> System.out.println(s));
		
		
		

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

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		
		new Thread(new Runnable() {

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
		
		
	}
}
