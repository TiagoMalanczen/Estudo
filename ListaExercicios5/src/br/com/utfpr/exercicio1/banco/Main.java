package br.com.utfpr.exercicio1.banco;

public class Main {
	public static void main(String[] args) {
		
		//=========Intanciando=========
		Cliente Jay = new Cliente("Jay", "123-456-789-10");
		Cliente Mary = new Cliente("Mary", "987-654-321-00");
		Banco banco = new Banco();
		
		//=========Testando=========
		banco.criarConta(111, Jay);
		banco.criarConta(222, Mary);
		
		banco.criarConta(222, Mary);

		
		System.out.println("=========================");
		banco.depositarValor(111, 100.00);
		banco.imprimirDados(111);
		
	
		
		System.out.println("=========================");
		banco.sacarValor(111, 20.00);
		banco.imprimirDados(111);
	}
}
