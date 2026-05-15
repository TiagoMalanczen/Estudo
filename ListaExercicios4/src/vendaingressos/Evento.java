package vendaingressos;

public class Evento {
	//===========Atributos===========

	private String nome;
	private Artista artista;
	private String data;
	private Local local;
	private String faixaEtaria;
	private int ingressosDisponiveis;

	
	//===========Construtor===========
	public Evento( String nome, String data, Local local, String faixaEtaria, Artista artista) {
		
		
		this.nome = nome;
		this.data = data;
		this.local = local;
		this.faixaEtaria = faixaEtaria;
		this.artista = artista;
		this.ingressosDisponiveis = local.getCapacidadeMaxima();
		
	}
	
	//===========Metodos===========
	public void realizarVenda(int quantiaIngressosDesejados) {
		if(quantiaIngressosDesejados <= this.ingressosDisponiveis) {
			this.ingressosDisponiveis -= quantiaIngressosDesejados;
			System.out.println("Venda realizada de " + quantiaIngressosDesejados + " ingressos , evento vendido");
	
		}else {
			System.out.println("Ingresso nao suficientes.");
		}
	}

	public void exibirRelatorio() {
	    System.out.println("=== RELATÓRIO DO EVENTO ===");
	    System.out.println("Evento: " + this.nome);
	    System.out.println("Data: " + this.data);
	    System.out.println("Classificação: " + this.faixaEtaria);
	    
	    System.out.println();

	 
	    System.out.println("Artista: " + this.artista.getNome()); 
	    
	    System.out.println();

	    System.out.println("Local: " + this.local.getNomeLocal());
	    System.out.println("Cidade: " + this.local.getEndereco().getCidade());
	    
	    System.out.println();
	    
	    System.out.println("Ingressos disponiveis: " + this.ingressosDisponiveis);
	    System.out.println("===========================");
	}
}
