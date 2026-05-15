package vendaingressos;

public class Artista {

	//===========Atributos===========
	private String nome;
	private String nacionalidade;
	private String biografia;
	

	//===========Construtor===========
	public Artista(String nome, String nacionalidade, String biografia) {
		
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.biografia = biografia;
		
	}

	//===========Getters===========
	public String getNome() {
		return nome;
	}


	public String getNacionalidade() {
		return nacionalidade;
	}


	public String getBiografia() {
		return biografia;
	}	
	
}
