package streamingutf;

public class Plano {

	//==============Atributos==============
	private String nome;
	private int limiteFilmes;
	private double mensalidade;
	
	
	//==============Construtor==============
	public Plano(String nome, int limiteFilmes, double mensalidade) {
		 
		this.nome = nome;
		this.limiteFilmes = limiteFilmes;
		this.mensalidade = mensalidade;
	}

	//==============Getters==============
	public String getNome() {
		return nome;
	}


	public int getLimiteFilmes() {
		return limiteFilmes;
	}


	public double getMensalidade() {
		return mensalidade;
	}

}
