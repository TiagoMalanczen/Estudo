package br.com.utfpr.exercicio1.banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	// =========Atributos=========
	private List<Conta> todasContas;

	// =========Construtor=========
	public Banco() {

		this.todasContas = new ArrayList<>();

	}

	// =========Metodos=========
	public void criarConta(int numeroConta, Cliente cliente) {
		if (this.verificarConta(numeroConta) == null) {
			Conta novaConta = new Conta(numeroConta, cliente);
			this.todasContas.add(novaConta);
			System.out.println("Conta " + numeroConta + " criada para: " + cliente.getNome());
		} else {
			System.out.println("Ja existe uma conta com esses dados");
		}
	}

	public void imprimirContas() {
		for (Conta ct : todasContas) {
			System.out.println(ct);
		}
	}

	public Conta verificarConta(int numero) {
		for (Conta ct : todasContas) {
			if (ct.getNumeroCorrespondente() == numero) {
				return ct;
			}
		}
		return null;
	}

	public void depositarValor(int numero, double valor) {
		if (this.verificarConta(numero) != null) {
			for (Conta ct : todasContas) {
				if (ct.getNumeroCorrespondente() == numero) {
					ct.realizarDeposito(valor);
				}
			}
		} else {
			System.out.println("Conta nao encontrada");
		}
	}

	public void sacarValor(int numero, double valor) {
		if (this.verificarConta(numero) != null) {
			for (Conta ct : todasContas) {
				if (ct.getNumeroCorrespondente() == numero) {
					ct.realizarSaque(valor);
				}
			}
		} else {
			System.out.println("Conta nao encontrada");
		}
	}

	public void imprimirDados(int numero) {

		Conta ct = this.verificarConta(numero);
		if (ct != null) {
			System.out.println("Numero da conta = " + ct.getNumeroCorrespondente());
			System.out.println("Nome cliente = " + ct.getCliente().getNome());
			System.out.println("Saldo = " + ct.getSaldo());

		}
		else {
			System.out.println("Conta nao encontrada");
		}

	}

}
