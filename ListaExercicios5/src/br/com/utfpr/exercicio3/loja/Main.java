package br.com.utfpr.exercicio3.loja;

public class Main {

	public static void main(String[] args) {
		//=============Instanciando==============
		Loja casasBahia = new Loja("123456789"," Casas Bahia");
		
		//=============Testando==============
		casasBahia.cadastrarProdutos(1, "mesinha", "mesa de canto", "nom tem galantia", 10, 1550.70);
		casasBahia.cadastrarProdutos(2, "mesinha", "geladeira", "tem galantia", 7, 2450.90);
		casasBahia.cadastrarProdutos(1, "mesinha", "mesa de canto", "nom tem galantia", 10, 1550.70);
		
		System.out.println("========================");
		casasBahia.listarProdutos();
	}
}
