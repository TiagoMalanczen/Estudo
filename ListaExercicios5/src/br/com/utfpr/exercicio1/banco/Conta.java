package br.com.utfpr.exercicio1.banco;

public class Conta {

	//=========Atributos========= 
	private int numeroCorrespondente;
	private double saldo;
	private Cliente cliente;
	
	//=========Construtor=========
	public Conta(int numeroCorrespondente, Cliente cliente) {
		
		this.numeroCorrespondente = numeroCorrespondente;
		this.saldo = 0.0;
		this.cliente = cliente;
	}
	
	//=========Metodos=========
	public void realizarDeposito(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito de " +valor+" realizado");
		}else {
			System.out.println("Valor invalido");
		}
	}
	public void realizarSaque(double valor) {
		if(valor < this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque de " +valor+" realizado");
		}else {
			System.out.println("Valor invalido");
		}
	}

	//=========Getters=========
public int getNumeroCorrespondente() {
		return numeroCorrespondente;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}
}
