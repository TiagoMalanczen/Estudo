package br.com.utfpr.exercicio4.alunos;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	//===========Atributos===========
	private String nomeDisciplina;
	private List<Alunos> alunosMatriculados;
	
	//===========Construtor===========
	public Disciplina(String nomeDisciplina) {
		
		this.nomeDisciplina = nomeDisciplina;
		this.alunosMatriculados = new ArrayList<>();
	}
	
	//===========Metodos===========
	public void matricularAlunos(Alunos aluno) {
		this.alunosMatriculados.add(aluno);
		System.out.println("Aluno matriculado com sucesso");
	}
	
	public void lancarNotas(int ra, double nota) {
		for(Alunos aluno: alunosMatriculados) {
			if(ra ==aluno.getRa()) {
				aluno.getNotas().add(nota);
				System.out.println("Nota adicionada com sucesso");
				return;
			}
		}
		System.out.println("Aluno nao encontrado");
	}
	public void calcularMedia(int ra, String nome) {
		int semestre = 0;
		double media = 0.0;
		for(Alunos aluno: alunosMatriculados) {
			if(ra == aluno.getRa()) {	
				for(Double notas : aluno.getNotas()) {
					
					System.out.println("Nota do semestre para o aluno "+ nome  + " = " + notas);
					semestre++;
					media += notas;
				}
				System.out.println("===================");
				System.out.println("Media do aluno para " + semestre + " semestres = " + media/semestre);
				
				System.out.println(this.calcularAprovacao(media, semestre));
				return;
			}
			
		}
		System.out.println("Aluno nao encontrado");
	}
	
	public String calcularAprovacao(double media , int semestre) {
		
		if(media/semestre >= 6.0) {
			return "Aluno aprovado";
		}
		else {
			return "Aluno reprovado";
		}
	}
}
