package bank;

public class TestAccount {
    public static void main(String[] args) {
        //========Instantiating dates========
        Bank bank = new Bank();

        Client tiago = new Client("Tiago", "128.775.439-31");

        Account account1 = new Account(1, tiago);

        //========Testing========
    account1.printData();
        System.out.println("=============");
    bank.addAccount(account1);

    System.out.println("=============");
    Account accountConsult = bank.searchAccount(1);
    if(accountConsult != null){
        System.out.println("Found Account:");
        accountConsult.printData();
    }
    else{
        System.out.println("Not found Account");
    }
    }
}
