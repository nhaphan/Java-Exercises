package account;

import customer.Customer;


public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account() {
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }


    public Customer getCustomer() {
        return customer;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return customer.toString().concat("balance=$".concat(String.valueOf((double) Math.round(balance*100)/100)));
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        Account account = new Account();
        account.balance += amount;
        return account;
    }

    public Account withdraw(double amount) {
        Account account = new Account();
        account.balance -= amount;
        return account;
    }

}
