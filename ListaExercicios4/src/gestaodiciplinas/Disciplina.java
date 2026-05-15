package gestaodiciplinas;

public class Disciplina {
    //===============Atributos===============
    private int codigoDisciplina;
    private String nome;
    private String modalidade;
    private int cargaHoraria;
    private Professor professor;

    //===============Construtor===============
    public Disciplina(int codigoDisciplina, String nome, String modalidade, int cargaHoraria, Professor professor) {
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.modalidade = modalidade;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    //===============Metodos===============
    public void emitirRelatorio(){

        System.out.println("Dados disciplina:");
        System.out.println("Codigo da disciplina = " + this.codigoDisciplina);
        System.out.println("Nome = " + this.nome);
        System.out.println("Modalidade =  " + this.modalidade);
        System.out.println("Carga horaria =  " + this.cargaHoraria);

        System.out.println("======================");

        System.out.println("Dados professor:");
        System.out.println("Registro = " + professor.getRegistro());
        System.out.println("Nome = " + professor.getNome());
        System.out.println("Data nascimento = " + professor.getDataNascimento());
        System.out.println("Salario= " + professor.getSalario());

    }
}
