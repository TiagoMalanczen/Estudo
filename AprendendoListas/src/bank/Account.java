package bank;

public class Account {
    //========Statics========
    private int number;
    private double balance;
    private Client owner;

    //========Constructor========
    public Account(int number, Client owner) {

        this.number = number;
        this.balance = 0.0;
        this.owner = owner;
    }
    //========Methods========
    public void deposit(double value){
        if(value < 0){
            System.out.println("It is not possible to deposit the balance");
        }
        else {
            System.out.println("Funds deposit successfully");
            balance += value;
        }

    }
    public void withdraw(double value){
        if(value > balance){
            System.out.println("It is not possible to withdraw the balance");
        }
        else {
            System.out.println("Funds successfully withdraw");
            balance -= value;
        }
    }
    public void printData() {

        System.out.println("Number = " + number);
        System.out.println("Owner = " + owner.getName());
        System.out.println("Balance = " + balance);

    }

    //========Getters========
    public double getBalance() {
        return balance;
    }

    public Client getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }
}
