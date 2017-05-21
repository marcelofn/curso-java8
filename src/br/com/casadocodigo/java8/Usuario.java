package br.com.casadocodigo.java8;

class Usuario {

	private String nome;
	private int pontos;
	private boolean moderador;

	public Usuario(String nome, int pontos, boolean moderador) {
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = moderador;
	}

	public String getNome() {
		return nome;
	}

	public int getPontos() {
		return pontos;
	}

	public boolean isModerador() {
		return moderador;
	}

	
	

}
