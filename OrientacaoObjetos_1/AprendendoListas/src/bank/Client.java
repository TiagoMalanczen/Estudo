package bank;

public class Client {
    //========Statics========
    private String name;
    private String CPF;

    //========Constructor========
    public Client(String name, String CPF) {
        this.name = name;
        this.CPF = CPF;
    }
    //========Getters========
    public String getName() {
        return name;
    }

    public String getCPF() {
        return CPF;
    }
}
