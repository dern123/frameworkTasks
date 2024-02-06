package app.task1.models;



import org.springframework.stereotype.Repository;

import java.util.Objects;
import java.util.UUID;
@Repository
public class Account {
    private Long id;
    private String number;
    private Currency currency;
    private Double balance;
    private Customer customer;

    public Account(String number, Customer customer) {
        this.number = number;
        this.customer = customer;
    }

    public Account(Long id, String number, Currency currency, Double balance, Customer customer) {
        this.id = id;
        this.number = number;
        this.currency = currency;
        this.balance = balance;
        this.customer = customer;
    }

    public Account(){}
    public void genericNumberAccount(){
        this.number = UUID.randomUUID().toString();
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", currency=" + currency +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(id, account.id) && Objects.equals(number, account.number) && Objects.equals(currency, account.currency) && Objects.equals(balance, account.balance) && Objects.equals(customer, account.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, currency, balance, customer);
    }

    public void setId(Long id){
        this.id = id;
    }
    public Long getId(){
        return this.id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
