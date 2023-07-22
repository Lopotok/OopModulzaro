package Bank;

public class Main {

    public static void main(String[] args) throws InsufficentMoney {

        BankAccount bankAccount= new BankAccount("Fulop",1000,"1234567");
        BankAccount bankAccount1= new BankAccount("En",2000,"7654321");

        bankAccount.deposit(1000);
        bankAccount.withdraw(1000);

        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getBalance());


        System.out.println();

    }
}
