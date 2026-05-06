package cadastrofuncionarios;

public class Funcionario {

    //===========Atributos===========
    private int numeroRegistro;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String setor;
    private String telefone;
    private Endereco endereco;

    //===========Construtor===========
    public Funcionario(int numeroRegistro, String nome, String dataNascimento, String sexo, String setor, String telefone, Endereco endereco) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    //===========Metodos===========
    public void imprimirDados(){
        System.out.println("Nome = " + this.nome);
        System.out.println("Data nascimento = " + this.dataNascimento);
        System.out.println("Sexo = " + this.sexo);
        System.out.println("Setor = " + this.setor);
        System.out.println("Telefone = " + this.telefone);
        System.out.println("====================");
        System.out.println("Logradouro = " + endereco.getLogradouro());
        System.out.println("Numero = " + endereco.getNumero());
        System.out.println("Bairro" + endereco.getBairro());
        System.out.println("Cidade" + endereco.getCidade());
        System.out.println("Unidade Federativa" + endereco.getUf());
    }

}
