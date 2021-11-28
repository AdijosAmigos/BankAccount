import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    //zadanie domowe 2 do sprawdzenia
    //stworzenie account z ujemnym balance (ma rzucic wyjatek)
    //do poprawienia wiadomsoc

    @Test
    void should_throw_exception_when_create_account_with_balance_less_than_zero(){

        //then
        Assertions.assertThatThrownBy(()->new Account(1, new BigDecimal(-1000)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("You can't create account with balance lower than ZERO");

    }

    //zadanie domowe 3 działa?
    //stworzenie account z ujemnym ID (ma rzucic wyjątek)
    //dopisac wiadomosc

    @Test
    void should_throw_exeption_when_create_account_with_id_less_than_zero(){

        //then

        Assertions.assertThatThrownBy(()->new Account(-1, new BigDecimal(1000)))
                .isInstanceOf(IllegalArgumentException.class);

    }

    //zadanie 4
    //sprawdzenie czy metoda debit odejmuje od balance
    //static import 108 na assert that

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
    //zreafctorowac wszystko co z account do account.test

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