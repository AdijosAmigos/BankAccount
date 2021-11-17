import java.math.BigDecimal;

public class BankService {

    void transfer(Account accountFrom, Account accountTo, BigDecimal amount)  {
        //////

        BigDecimal accountToBalance = accountTo.getBalance();
        BigDecimal accountFromBalance = accountFrom.getBalance();

        try {
            accountToBalance.add(amount);
            accountFromBalance.subtract(amount);
        }
        catch(IllegalArgumentException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("balance accountFrom: " +accountFromBalance);
            System.out.println("balance accountTo: "+ accountToBalance);
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
