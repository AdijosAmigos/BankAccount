import java.math.BigDecimal;
import java.util.HashMap;

public class Account {
    private int id;
    private BigDecimal balance;


    public Account(int id, BigDecimal balance) {

        if(id<0) {
            throw new IllegalArgumentException();
        }

        if(balance == null || balance.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException();
        }

        this.id = id;
        this.balance = balance;

    }


    //test dla account
    //1.


    public int getId() {
        return id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void credit(BigDecimal amount){
        balance = balance.add(amount);
    }

    public void debit(BigDecimal amount){
        balance = balance.subtract(amount);
    }

}
