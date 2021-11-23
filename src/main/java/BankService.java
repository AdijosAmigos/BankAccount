import java.math.BigDecimal;
import java.util.function.BiFunction;

public class BankService{

    void transfer(Account accountFrom, Account accountTo, BigDecimal amount)  {
        //////

        if(amount.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Amount not bigger than 0");
        }

        //if(accountFrom.getBalance()<amount){wyjatek}

        if(amount.compareTo(accountFrom.getBalance()) <= 0){
            throw new IllegalArgumentException("Balance not enought to do transaction");
        }


        accountFrom.debit(amount);
        accountTo.credit(amount);

    }

    public BankService() {

    }

}
