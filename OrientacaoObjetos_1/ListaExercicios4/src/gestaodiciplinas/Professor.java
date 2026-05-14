package gestaodiciplinas;

public class Professor {
    //===============Atributos===============
    private int registro;
    private String nome;
    private String dataNascimento;
    private double salario;

    //===============Construtor===============
    public Professor(int registro, String nome, String dataNascimento, double salario) {
        this.registro = registro;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    //===============Getters===============
    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }
}
