package streamingutf;

public class Filme {
	//==============Atributos==============
	private int id;
	private String titulo;
	private double valor;
	
	//==============Construtor==============
	public Filme(int id, String titulo, double valor) {
		
		this.id = id;
		this.titulo = titulo;
		this.valor = valor;
	}

	
	//==============Getters==============
	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getValor() {
		return valor;
	}
	
}
