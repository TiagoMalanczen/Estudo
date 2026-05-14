package br.com.utfpr.exercicio4.alunos;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
	//===========Atributos===========
	private int ra;
	private String nome;
	private List<Double> notas;
	
	//===========Construtor===========
	public Alunos(int ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.notas = new ArrayList<>();
	}
	
//===========Getters===========
	public int getRa() {
		return ra;
	}

	public String getNome() {
		return nome;
	}

	public List<Double> getNotas() {
		return notas;
	}
	
	
	
}
