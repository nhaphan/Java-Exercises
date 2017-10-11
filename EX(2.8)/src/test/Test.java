package test;

import account.Account;
import customer.Customer;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Zed",'m');
        Account account = new Account(1,customer,5.5555);
    }
}
