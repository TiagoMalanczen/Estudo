package petshop;

public class Main {
    public static void main(String[] args) {
        //===============Instanciando===============
        Endereco endereco1 = new Endereco("Travessa", 120, "Jundiai", "Sao Paulo", "SP");
        Dono Luccas = new Dono("123456789", "Luccas", "9912-3456","luccas@gmail.com", endereco1);
        Animal cachorro = new Animal("Rex", "macho", 7, Luccas);

        //===============Testando===============

        cachorro.ralatarDados();
        System.out.println("---------------");
        cachorro.iniciarTratamento("10/05", "Operacao na barriga");

        cachorro.ralatarDados();

        System.out.println("---------------");

        cachorro.finalizarTratamento("04/06");

        cachorro.ralatarDados();
    }
}
