package streamingutf;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	//==============Atributos==============
	private int id;
	private Plano plano;
	
	private List<Filme> filmesAlugados;

	//==============Construtor==============
	public Cliente(int id, Plano plano) {
		 
		this.id = id;
		this.plano = plano;
		this.filmesAlugados = new ArrayList<>();
	}
	
	//==============Getters==============
	public int getId() {
		return id;
	}


	public Plano getPlano() {
		return plano;
	}

	public List<Filme> getFilmesAlugados() {
		return filmesAlugados;
	}
	
}
