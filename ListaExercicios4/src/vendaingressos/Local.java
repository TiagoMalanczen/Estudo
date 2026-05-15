package vendaingressos;

public class Local {
	//===========Atributos===========
	private String nomeLocal;
	private Endereco endereco;
	private int capacidadeMaxima;
	

	//===========Construtor===========
	public Local(String nomeLocal, Endereco endereco, int capacidadeMaxima) {
		
		this.nomeLocal = nomeLocal;
		this.endereco = endereco;
		this.capacidadeMaxima = capacidadeMaxima;
		
	}


	//===========Getters===========
	public String getNomeLocal() {
		return nomeLocal;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public int getCapacidadeMaxima() {
		return capacidadeMaxima;
	}
	

}
