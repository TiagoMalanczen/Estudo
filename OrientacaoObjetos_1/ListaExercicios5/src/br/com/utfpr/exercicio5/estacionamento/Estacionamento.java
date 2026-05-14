package br.com.utfpr.exercicio5.estacionamento;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {

	//==============Atributos==============
	private List<Vaga> vagas;
	private int horas;
	
	//==============Construtor==============
	public Estacionamento() {
		
		this.vagas = new ArrayList<>();
	}
	
	//==============Metodos==============
	public void inicializarEstacionamento() {
			for(int i=0; i<5;i++) {
				Vaga vaga = new Vaga(i);
				this.vagas.add(vaga);
			}
		
	}
	
	public void listarVagas() {
		int i = 1;
		for(Vaga vag: vagas) {
			
			System.out.println("Vaga " + i + " " +vag.isOcupado());
			i++;
		}
	}
	
	public void estacionarVeiculo(Veiculo veiculo, int horaEntrada) {
		Vaga v = this.buscarVagaDisponivel();
		if(v != null) {
			System.out.println("Estacionanando veiculo");
			v.setOcupado(true);
		}
		else {
			System.out.println("Nenhuma vaga disponivel");
		}
	}
	
	
	public Vaga buscarVagaDisponivel() {
		for(Vaga vag: vagas) {
			if(!vag.isOcupado()) {
				return vag;
			}
		}
		return null;
	}
}
