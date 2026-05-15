package br.com.utfpr.exercicio2.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	//===========Atributos===========

	private List<Livro>  livros;
	
	//===========Construtor===========
	public Biblioteca() {
		this.livros = new ArrayList<>();
		
		this.iniciarLivros();
	}
	
	//===========Metodos===========
	private void iniciarLivros() {
		
		this.livros.add(new Livro("Java - Como Programar", "Paul Deitel", 2016, "Pearson", 968));
		this.livros.add(new Livro("Sistemas Operacionais Modernos", "Andrew Tanenbaum", 2015, "Pearson", 864));
		this.livros.add(new Livro("Engenharia de Software", "Roger Pressman", 2021, "AMGH", 704));
	}
	
	public void emprestarLivro(String titulo, int dia) {
		
		Livro livro = this.buscarLivro(titulo);
		
		if(livro != null) {
			if(livro.getDisponivel()) {
			System.out.println("Livro emprestado com sucesso");
			livro.setDisponivel(false);	
			livro.setDiaEmprestimo(dia);
			}
			else {
				System.out.println("Livro nao disponivel");
			}
		}else {
			System.out.println("Livro nao encontrado");
		}
	}
	
public void devolverLivro(String titulo, int dia) {
		
		Livro livro = this.buscarLivro(titulo);
		
		if(livro == null) {
			System.out.println("Livro nao encontrado");
			return;
		}
		if(!livro.getDisponivel()) {
			this.calcularAtraso(livro, dia);
			livro.setDisponivel(true);
			livro.setDiaEmprestimo(0);
			
			System.out.println("Livro devolvido com sucesso");
		}
		else {
			System.out.println("Livro ja esta disponivel");
		}
	
	}

	public void calcularAtraso(Livro livro, int diaDevolucao) {
		
		int totalDias = diaDevolucao - livro.getDiaEmprestimo();
		if(totalDias > 7) {
			int diasExcedidos = totalDias - 7;
			this.calcularMulta(diasExcedidos);
		}
	}
	
	public void calcularMulta(int diasExcedidos) {
		double multa = diasExcedidos * 1.50;
		System.out.println("A multa a ser paga e de " + multa + " reais ");
		
	}
	public Livro buscarLivro(String titulo) {
		for(Livro livro: livros) {
			
			if(livro.getTitulo().equals(titulo)) {
				
				return livro;
				
			}
		}
		return null;
	}
}
