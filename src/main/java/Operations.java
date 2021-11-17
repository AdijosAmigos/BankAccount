import java.math.BigDecimal;

public interface Operations {

    public abstract BigDecimal getBalance(BigDecimal balance);

    public abstract void makeTransfer(Account account1, Account account2, BigDecimal amount);

    public abstract void takeLoan (Account account, AccountOwner accountOwner, BigDecimal amount);

    public abstract void payBill (Account accountFrom, AccountOwner accountOwner, Account accountTo, BigDecimal amount);




}
