package br.com.utfpr.exercicio1.banco;

public class Cliente {

	//=========Atributos=========
	private String nome;
	private String cpf;
	
	//=========Construtor=========
	public Cliente(String nome, String cpf) {
		
		this.nome = nome;
		this.cpf = cpf;
	}

	
	//=========Getters=========
public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	
}
