package br.com.utfpr.exercicio5.estacionamento;

import java.util.List;

public class Vaga {
	//==============Atributos==============
	private int numIdentificacao;
	private boolean ocupado;
	private List<Veiculo> veiculo;

	//==============Construtor==============
	public Vaga(int numIdentificacao) {
		
		this.numIdentificacao = numIdentificacao;
		this.ocupado = false;
	}

	
	//==============Getters==============
	public int getNumIdentificacao() {
		return numIdentificacao;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public List<Veiculo> getVeiculo() {
		return veiculo;
	}


	//==============Setters==============

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
