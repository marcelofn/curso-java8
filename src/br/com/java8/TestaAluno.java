package br.com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestaAluno {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Phyton", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		cursos.forEach(c -> System.out.println(c.getNome()));
		System.out.println("\n====================================================\n");
		// cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c ->
		// System.out.println(c.getNome()));

		cursos.stream().filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		// cursos.stream().map(c -> c.getNome()).forEach(System.out::println);

		// cursos.stream().filter(c -> c.getAlunos() >=
		// 1000).findAny().ifPresent(c -> System.out.println(c.getNome()));
		
		//OptionalDouble media = cursos.stream().mapToInt(c -> c.getAlunos()).average();
		//System.out.println(media);
		
	}

}
