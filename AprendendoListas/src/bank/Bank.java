package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    //========Statics========
    private List<Account> accounts;

    //========Construction========
    public Bank() {
        this.accounts = new ArrayList<>();
    }

    //========Methods========
    public void addAccount(Account act) {
        accounts.add(act);
        System.out.println("Account add");
    }
    public Account searchAccount(int account){
        for (Account act: accounts){
            if (act.getNumber() == account){
                return act;
            }
        }
        return null;
    }
}
