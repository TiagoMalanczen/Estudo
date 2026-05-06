package sistemabancario;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Avenida Paulista", 1578, "Bela Vista", "São Paulo", "SP");
        Titular titular1 = new Titular("123.456.789-00", "12.345.678-9", "Lucas Silva Sauro", "15/05/1992", "Masculino", 4500.50, endereco1);
        Conta minhaConta = new Conta(1, 123456, titular1, 1000.00);

        minhaConta.emitirSaldo();
    }
}