import java.math.BigDecimal;
import java.util.function.BiFunction;

public class BankService{

    void transfer(Account accountFrom, Account accountTo, BigDecimal amount)  {
        BankService bankService = new BankService();

        if(amount.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Amount not bigger than 0");
        }

        if(accountFrom.getBalance().compareTo(amount) < 0){
            throw new IllegalArgumentException("Balance not enought to do transaction");
        }

        if(amount.compareTo(BigDecimal.ZERO) < 0 && accountFrom.getBalance().compareTo(amount)<=0){
            bankService.transfer(accountFrom, accountTo, amount);
        }
        /*
        else{
            throw new IllegalArgumentException();
        }
        */



        accountFrom.debit(amount);
        accountTo.credit(amount);

    }

    public BankService() {

    }

}
