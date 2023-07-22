package Bank;

public class InsufficentMoney extends Exception{

    public InsufficentMoney(String message) {
        super(message);
    }
}
