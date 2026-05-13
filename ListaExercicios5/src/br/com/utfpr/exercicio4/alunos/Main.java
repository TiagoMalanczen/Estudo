package br.com.utfpr.exercicio4.alunos;

public class Main {

	public static void main(String[] args) {
		//===========Instanciando===========
		Disciplina matematica = new Disciplina("Matematica");
		
		Alunos jao = new Alunos(123456789, "Jao");
		//===========Testando===========
		matematica.matricularAlunos(jao);
		matematica.lancarNotas(123456789, 21);
		matematica.lancarNotas(123456789, 5);
		matematica.lancarNotas(123456789, 8);
		
		System.out.println("=====================");
		
		matematica.calcularMedia(123456789, "jao");
	
	}
}
