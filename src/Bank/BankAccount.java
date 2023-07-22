package Bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountName;

    private int balance;
    private final String accountNumber;

    public BankAccount(String accountName, int balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }
    public int deposit( int money){
       return this.balance += money;
    }
    public int withdraw (int money) throws InsufficentMoney{
        if( this.balance > 0){
            return this.balance -= money;
        }
        throw new InsufficentMoney("Nincs eleg penz a szamlan");

    }
    public int transfer (int money) throws InsufficentMoney{{
        if( this.balance > 0){
            return this.balance -= money;
        }
        throw new InsufficentMoney("Nincs eleg penz a szamlan");

    }
    }



}
