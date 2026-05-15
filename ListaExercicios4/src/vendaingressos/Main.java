package vendaingressos;

public class Main {
 
	public static void main(String[] args) {
		//=========Instanciando=========
		Artista jaime = new Artista("Jaime", "Brasileiro", "violeiro com 10 anos de experiencia");
		
		Endereco endereco = new Endereco("Chafariz", 115, "Ipirapuera", "Sao Paulo", "SP");
		
		Local local = new Local("Ipirapuera", endereco, 100);
		
		Evento modao = new Evento("modao", "23/07", local, "+ 14", jaime);
		
		//=========Teste=========
		modao.exibirRelatorio();
		
		modao.realizarVenda(10);
		
		modao.exibirRelatorio();
	}
}
