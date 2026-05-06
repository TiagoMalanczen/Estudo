package petshop;

public class Endereco {
    //===========Atributos===========
    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String uf;

    //===========Construtor===========
    public Endereco(String logradouro, int numero, String bairro, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }
    //===========Getters===========
    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return uf;
    }
}
