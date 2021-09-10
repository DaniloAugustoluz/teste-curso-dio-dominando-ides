package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato();
		livros Livroclass = new livros();
		
		System.out.println(gato);
		System.out.println(Livroclass);
		/*		
	int a = 10;
	int b = 10;	
	int c = a + b;	
		System.out.println("Hello world! " + c);
*/
	}

}

class livros {
	private String nome;
	private String npag;
}