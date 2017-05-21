package br.com.casadocodigo.java8;

import java.util.Arrays;
import java.util.List;

public class TesteUsuarios {

	public static void main(String[] args) {
		Usuario u1 = new Usuario("marcelo", 10, false);
		Usuario u2 = new Usuario("franca", 3, true);
		Usuario u3 = new Usuario("ana", 10, false);

		List<Usuario> usuarios = Arrays.asList(u1, u2, u3);

		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}

		usuarios.forEach(u -> System.out.println(u.getNome()));

	}

}
