package streamingutf;

public class Main {

	public static void main(String[] args) {
		//================Instanciando================
		
		Streaming netflix = new Streaming(); 
		
		Plano prata = new Plano("Prata", 2, 29.90);
		Plano ouro = new Plano("Ouro", 5, 45.90);
		Plano diamante = new Plano("Diamante", 999, 80.00);
		
		Cliente joao = new Cliente(123, ouro);
		Cliente maria = new Cliente(321, diamante);
		
		netflix.cadastrarFilme(123456, "Tio patinhas", 10.70);
		
		netflix.cadastrarClientes(maria);
		netflix.cadastrarClientes(joao);
		
		System.out.println("----");
		
		netflix.alugarFilme(123, 123456);
		netflix.alugarFilme(123, 123456);
		netflix.alugarFilme(123, 123456);
		netflix.alugarFilme(123, 123456);
		netflix.alugarFilme(123, 123456);
		
		netflix.calcularFaturamento();
	}
}
