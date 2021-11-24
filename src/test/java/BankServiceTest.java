import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {
    @Test
    void should_throw_excepction_when_amount_less_than_zero(){
        // given
        Account account1 = new Account(1, new BigDecimal(1000));
        Account account2 = new Account(2, new BigDecimal(2000));
        BankService bankService = new BankService();
        //when

        //then
        Assertions.assertThatThrownBy(()->bankService.transfer(account1, account2, new BigDecimal(-1)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Amount not bigger than 0");

    }

    @Test
    void should_throw_excepction_when_amount_less_than_zero_second_methood(){
        // given
        Account account1 = new Account(1, new BigDecimal(1000));
        Account account2 = new Account(2, new BigDecimal(2000));
        BankService bankService = new BankService();
        //when

        bankService.transfer(account1, account2, new BigDecimal(-1));

        //then



    }

    @Test
    void should_tranfer_money_when_correct_parameter(){
        //given
        Account account1 = new Account(1, new BigDecimal(1000));
        Account account2 = new Account(2, new BigDecimal(2000));
        BankService bankService = new BankService();
        //when
        bankService.transfer(account1, account2,  new BigDecimal(1000));
        //then
        Assertions.assertThat(account1.getBalance()).isEqualTo(BigDecimal.ZERO);
        Assertions.assertThat(account2.getBalance()).isEqualTo(new BigDecimal(3001));
    }

    //zadanie domowe 1
    //sprawdzenie ze account1 ma wystarczajaco pieniedzy
    @Test
    void should_throw_excepction_when_account_balance_less_than_amount(){
        //given
        Account account1 = new Account(1, new BigDecimal(1000));
        Account account2 = new Account(2, new BigDecimal(2000));
        BankService bankService = new BankService();
        //when
        bankService.transfer(account1, account2, new BigDecimal(101));
        //then

    }

    //zadanie domowe 2 do sprawdzenia
    //stworzenie account z ujemnym balance (ma rzucic wyjatek)

    @Test
    void should_throw_exception_when_create_account_with_balance_less_than_zero(){
        //givien
        Account account1 = new Account(1, new BigDecimal(1000));
        //when

        //then
        Assertions.assertThatThrownBy(()->account1.getBalance().compareTo(BigDecimal.ZERO))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("You can't create account with balance lower than ZERO");

    }

    //zadanie domowe 3 działa?
    //stworzenie account z ujemnym ID (ma rzucic wyjątek)

    @Test
    void should_throw_exeption_when_create_account_with_id_less_than_zero(){
        //given
        Account account1 = new Account(1, new BigDecimal(1000));
        //when

        //then
        Assertions.assertThat(account1.getId()).isGreaterThan(0);
    }

    //zadanie 4
    //sprawdzenie czy metoda debit odejmuje od balance

    @Test
    void should_debit_metohod_substract_from_balance(){
        //given
        Account account1 = new Account(1, new BigDecimal(1000));
        BankService bankService = new BankService();
        //when
        account1.debit(new BigDecimal(500));
        //then
        Assertions.assertThat(account1.getBalance()).isEqualTo(new BigDecimal(700));
    }

    //zadanie 5
    //sprawdzenie czy metoda credit dodaje do balance

    @Test
    void should_credit_method_add_to_balance(){
        //given
        Account account1 = new Account(1, new BigDecimal(1000));
        BankService bankService = new BankService();
        //when
        account1.credit(new BigDecimal(500));
        //then
        Assertions.assertThat(account1.getBalance()).isEqualTo(new BigDecimal(1500));
    }

}