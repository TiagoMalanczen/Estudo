package sistemabancario;

public class Conta {
    //===============Atributos===============
    private int numeroAgencia;
    private int numeroConta;
    private Titular titular;
    private double saldo;

    //===============Construtor===============

    public Conta(int numeroAgencia, int numeroConta, Titular titular, double saldo) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    //===============Metodos===============
    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Sacando " + valor + " reais");
            this.saldo -= valor;
        }
    }

    public void depositar(double valor){
        if (valor >= 0){
            System.out.println("Depositando " + valor + " reais");
            this.saldo += valor;
        }else {
            System.out.println("Valor invalido");
        }
    }
    public void emitirSaldo(){
        System.out.println("Dados conta");
        System.out.println("Numero agencia =" + this.numeroAgencia);
        System.out.println("Numero conta = " + this.numeroConta);
        System.out.println("Numero saldo = " + this.saldo);
        System.out.println("===================");
        System.out.println("Dados titular");
        System.out.println("Numero cpf = " + titular.getCpf());
        System.out.println("Numero rg = " + titular.getRg());
        System.out.println("Numero nome = " + titular.getNome());
        System.out.println("Numero dataNascimento = " + titular.getDataNascimento());
        System.out.println("Numero sexo = " + titular.getSexo());
        System.out.println("Numero rendaMensal = " + titular.getRendaMensal());
        System.out.println("===================");
        System.out.println("Dados endereco do titular");
        System.out.println("Numero logradouro = " + titular.getEndereco().getLogradouro());
        System.out.println("Numero numero = " + titular.getEndereco().getNumero());
        System.out.println("Numero bairro = " + titular.getEndereco().getBairro());
        System.out.println("Numero cidade = " + titular.getEndereco().getCidade());
        System.out.println("Numero uf = " + titular.getEndereco().getUf());

    }
}
