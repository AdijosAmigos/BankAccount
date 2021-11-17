import java.math.BigDecimal;

public class BankService implements Operations{

    void transfer(Account accountFrom, Account accountTo, BigDecimal amount)  {
        //////

        BigDecimal accountToBalance = accountTo.getBalance();
        BigDecimal accountFromBalance = accountFrom.getBalance();

        accountToBalance.add(amount);

        try {
            accountFromBalance.subtract(amount);
        }
        catch(IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("amount must be > 0");
            System.out.println("you need: "+amount);
        }
        finally {
            System.out.println("your balance: " +accountFromBalance);
        }


    }

    public class Account {
        private int id;
        private BigDecimal balance;

        public Account(int id, BigDecimal balance){

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public BigDecimal getBalance() {
            return balance;
        }

        public void setBalance(BigDecimal balance) {
            this.balance = balance;
        }
    }

    public BankService() {

    }

}
