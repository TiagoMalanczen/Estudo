package br.com.utfpr.exercicio5.estacionamento;

public class Main {

	public static void main(String[] args) {
		//==============Instanciando==============
		Estacionamento est = new Estacionamento();
		
		Veiculo carro = new Veiculo("Ford-k", "asd", "roxo");
		
		//==============Testando==============
		est.inicializarEstacionamento();
		
		est.listarVagas();
		
		System.out.println();
		
		est.estacionarVeiculo(carro, 17);
		
		System.out.println();
		
		est.listarVagas();
	}
}
