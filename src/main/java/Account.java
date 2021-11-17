import java.math.BigDecimal;
import java.util.HashMap;

public class Account {
    AccountOwner accountOwner;
    String accountPassowrd;
    String accountUsername;
    int accountId;
    BigDecimal accountBalance;
    HashMap<Account, AccountOwner> accountOwnerHashMap = new HashMap<>();

}
