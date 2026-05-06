package petshop;

public class Animal {
    //===============Atributos===============
    private String nome;
    private String sexo;
    private int idade;
    private Dono dono;
    private Tratamento tratamento;

    //===============Construtor===============
    public Animal(String nome, String sexo, int idade, Dono dono) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.dono = dono;
        this.tratamento = null;
    }

    //===============Metodos===============
    public void  iniciarTratamento( String dataInicio, String descricao){
        this.tratamento = new Tratamento(dataInicio, descricao);
        System.out.println("Iniciando tratamento");
    }
    public void  finalizarTratamento(String dataFim){
        if (this.tratamento != null){
            System.out.println("Tratamento finalizado");
            this.tratamento.setDataFim(dataFim);
        }else {
            System.out.println("Tratamento nao encontrado");
        }
    }
    public void ralatarDados(){
        System.out.println("Dados animal:");
        System.out.println("Nome = " + this.nome);
        System.out.println("Sexo = " + this.sexo);
        System.out.println("Idade = " + this.idade);
        System.out.println("Dono = " + dono.getNome());
        System.out.println("================");
        if (this.tratamento != null){
            System.out.println("Dados do tratamento do animal");
            System.out.println("Data de incio do tratamento = " + tratamento.getDataInicio());
            System.out.println("Data de fim do tratamento = " + tratamento.getDataFim());
            System.out.println("Descricao = " + tratamento.getDescricao());
            System.out.println("================");
        }
        System.out.println("Dados dono:");
        System.out.println("Logradouro = " + this.dono.getEndereco().getLogradouro());
        System.out.println("Numero = " + this.dono.getEndereco().getNumero());
        System.out.println("Bairro = " + this.dono.getEndereco().getBairro());
        System.out.println("Cidade = " + this.dono.getEndereco().getCidade());
        System.out.println("Unidade Federativa = " + this.dono.getEndereco().getUf());

    }
}
