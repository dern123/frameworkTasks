package app.task1;

import app.task1.models.Account;
import app.task1.models.Currency;
import app.task1.models.Customer;

import java.util.List;

public class Aplication {

    public static void main(String[] args) {
        System.out.println("HELLO JAVA");
        Customer customer = new Customer(1L,"John","google.com",27);
        Account account = new Account(1L,"1", Currency.USD, 120.1, customer);
        account.genericNumberAccount();
        System.out.println(account.toString());
    }
}
