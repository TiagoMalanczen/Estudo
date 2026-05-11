package br.com.utfpr.exercicio3.loja;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	 //==============Atibutos==============
	private String cnpj;
	private String razaoSocial;
	
	private List<Produto> listaProdutos;
	
	//=============Construtor==============
	public Loja(String cnpj, String razaoSocial) {
	
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.listaProdutos = new ArrayList<>();
		
		
	}
	
	
	//=============Metodos==============
	public void cadastrarProdutos(int codigo, String nomeProduto, String marca, String modelo, int quantidadeEstoque,
			double valorUnitario) {
		
		Produto p = this.buscarProduto(codigo);
		
		if(p != null) {
			System.out.println("Produto ja cadastrado, adicionando " + quantidadeEstoque + " ao estoque");
			p.setQuantidadeEstoque(p.getQuantidadeEstoque() + quantidadeEstoque);
		}
		else {
			System.out.println("Cadastrando produto");
			Produto produto = new Produto(codigo, nomeProduto,  marca,  modelo,  quantidadeEstoque,
					 valorUnitario);
			this.listaProdutos.add(produto);
		}
	}
	
	public void listarProdutos() {
		for(Produto p : listaProdutos) {
			System.out.println("Codigo = " + p.getCodigo());
			System.out.println("Marca = " + p.getMarca());
			System.out.println("Modelo = " + p.getModelo());
			System.out.println("Nome = " + p.getNomeProduto());
			System.out.println("Quantidade estoque = " + p.getQuantidadeEstoque());
			System.out.println("Valor unitario = " + p.getValorUnitario());
			
			System.out.println("========================");

		}
	}
	public void adquirirProdutos(int codigo, int quantidadeSolicitada) {
		Produto p = this.buscarProduto(codigo);
		
		if(p != null) {
				p.setQuantidadeEstoque(p.getQuantidadeEstoque() + quantidadeSolicitada);
		}
		else {
			System.out.println("Produto nao encontrado");
		}	
	}
	
	public void venderProduto(int codigo, int quantidadeSolicitada) {
		Produto p = this.buscarProduto(codigo);
		
		if(p != null) {
			if(quantidadeSolicitada > p.getQuantidadeEstoque() ) {
				System.out.println("Estoque nao suficiente para venda");
			}
			else {
				System.out.println("Venda realizada com sucesso");
				p.setQuantidadeEstoque(p.getQuantidadeEstoque() - quantidadeSolicitada);
			}
		}
		else {
			System.out.println("Produto nao encontrado");
		}
	}
	public Produto buscarProduto(int codigo) {
		for(Produto p : listaProdutos) {
			if(p.getCodigo() == codigo) {
				return p;
			}
		}
		return null;
	}
}

