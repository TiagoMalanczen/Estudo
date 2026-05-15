package gestaodiciplinas;

public class Main {
    public static void main(String[] args) {
        //===============Instanciado===============
        Professor Joao = new Professor(1, "Joao", "07/08/2000", 3500.00);
        Disciplina matematica = new Disciplina(123, "Matematica", "Exatas", 300, Joao);

    matematica.emitirRelatorio();
    }
}
