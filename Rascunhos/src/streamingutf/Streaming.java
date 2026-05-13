package streamingutf;

import java.util.ArrayList;
import java.util.List;

public class Streaming {

	//==============Atributos==============
	
	private List<Cliente> clientes;
	private List<Filme> catalogo;
	
	//==============Construtor==============
	public Streaming() {
		
		this.clientes = new ArrayList<>();
		this.catalogo = new ArrayList<>();
	}
	
	//==============Metodos==============
	public void cadastrarClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void cadastrarFilme( int id, String titulo, double valor) {
		Filme filme = new Filme(id, titulo, valor);
		this.catalogo.add(filme);
	}
	
	
	public void alugarFilme(int idCliente, int idFilme) {
		Filme f = this.buscarFilme(idFilme);
		Cliente c = this.buscarCliente(idCliente);
		
		if(f == null) {
			System.out.println("Filme nao encontrado");
			return;
		}
		if(c == null) {
			System.out.println("Cliente nao encontrado");
			return;
		}
		
		if(c.getFilmesAlugados().size() < c.getPlano().getLimiteFilmes()) {
			c.getFilmesAlugados().add(f);
			System.out.println("Filme adicionado com sucesso");
		}
		else {
			System.out.println("Bloqueado pois o plano" + c.getPlano().getNome() + " do cliente " + c.getId() + " atingiu seu limite");
		}
	}
	public void calcularFaturamento() {
		double total = 0.0;
		for(Cliente cliente: clientes) {
			total += cliente.getPlano().getMensalidade();
		}
		System.out.println("O toral arrecadado pela empresa mensalmente eh " + total);
	}
	public void exibirRelatoriaCliente(int idCliente) {
		Cliente c = this.buscarCliente(idCliente);
		if(c != null) {
			System.out.println("Id = " + c.getId());
			System.out.println("Plano = " + c.getPlano().getNome());
			System.out.println("Filmes alugados: ");
			for(Filme filme : c.getFilmesAlugados()) {
				System.out.println("- " + filme.getTitulo());
			}
		}
	}
	public Cliente buscarCliente(int idCliente) {
		for(Cliente cliente : clientes) {
			if(idCliente == cliente.getId()) {
				return cliente;
			}
		}
		return null;
	}
	public Filme buscarFilme(int idFilme) {
		for(Filme filme : catalogo) {
			if(idFilme == filme.getId()) {
				return filme;
			}
		}
		return null;
	}
}
