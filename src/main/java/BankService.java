import java.math.BigDecimal;

public class BankService {

    void transfer(Account accountFrom, Account accountTo, BigDecimal amount)  {
        //////

        BigDecimal AmountTo = accountTo.getBalance();
        BigDecimal AmountFrom = accountFrom.getBalance();



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
