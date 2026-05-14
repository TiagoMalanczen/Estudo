package br.com.utfpr.exercicio2.biblioteca;

public class Livro {

	//===========Atributos===========
	private String titulo;
	private int anoPublicacao;
	private String autor;
	private String editora;
	private int numPaginas;
	
	private boolean disponivel ;
	private int diaEmprestimo;
	
	//===========Construtor===========
	public Livro(String titulo, String autor, int anoPublicacao, String editora, int numPaginas) {
	
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
		this.autor = autor;
		this.editora = editora;
		this.numPaginas = numPaginas;
		this.disponivel = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditora() {
		return editora;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public boolean getDisponivel() {
		return disponivel;
	}

	public int getDiaEmprestimo() {
		return diaEmprestimo;
	}

	public void setDiaEmprestimo(int diaEmprestimo) {
		this.diaEmprestimo = diaEmprestimo;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
