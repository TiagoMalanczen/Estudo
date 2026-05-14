package br.com.utfpr.exercicio3.loja;

public class Produto {

	//=============Atributos==============
	private int codigo;
	private String nomeProduto;
	private String marca;
	private String modelo;
	private int quantidadeEstoque;
	private double valorUnitario;
	
	private boolean cadastrado;
	//=============Construtor==============
	public Produto(int codigo, String nomeProduto, String marca, String modelo, int quantidadeEstoque,
			double valorUnitario) {
	
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.marca = marca;
		this.modelo = modelo;
		this.quantidadeEstoque = quantidadeEstoque;
		this.valorUnitario = valorUnitario;
		this.cadastrado = false;
	}
	
	//=============Getters==============
	public int getCodigo() {
		return codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public boolean isCadastrado() {
		return cadastrado;
	}

	//=============Setters==============

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	

}
