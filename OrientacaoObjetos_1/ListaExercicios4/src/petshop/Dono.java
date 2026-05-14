package petshop;

public class Dono {

    //===============Atributos===============
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;

    //===============Construtor===============

    public Dono(String cpf, String nome, String telefone, String email , Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    //===============Getters===============

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
