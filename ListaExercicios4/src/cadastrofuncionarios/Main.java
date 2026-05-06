package cadastrofuncionarios;

public class Main {
    public static void main(String[] args) {

    //===========Instanciando===========
        Endereco enderecof1 = new Endereco("Travessa", 120, "Jundiai", "Sao Paulo", "SP");
        Funcionario f1 = new Funcionario(1, "John", "15/04-1997", "masculino", "imobiliario", "9912-4567",enderecof1);

    //===========Teste===========
        System.out.println("===============");
        f1.imprimirDados();
    }
}
