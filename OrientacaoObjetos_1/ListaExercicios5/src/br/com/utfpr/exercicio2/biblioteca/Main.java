package br.com.utfpr.exercicio2.biblioteca;

public class Main {

	public static void main(String[] args) {
		//===========Instanciando===========
		Biblioteca biblioteca = new Biblioteca();


		//===========Testando===========
		biblioteca.emprestarLivro("Sistemas Operacionais Modernos", 10);
		
		biblioteca.devolverLivro("Sistemas Operacionais Modernos", 10);
		biblioteca.devolverLivro("Sistemas Operacionais Modernos", 20);
		
		
	}
}
