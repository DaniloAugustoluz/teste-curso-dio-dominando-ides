package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		livros Livroclass = new livros();
		
		System.out.println(gato);
		System.out.println(Livroclass);

	}

}

class livros {
	private String nome;
	private String npag;
	private String categoria;
}