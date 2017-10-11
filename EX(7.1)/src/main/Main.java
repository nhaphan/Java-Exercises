package main;

import customer.Customer;
import visit.Visit;

/**
 * Created by thanhnha on 11/10/2017.
 */
public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("Nha");
        customer.setMember(true);
        customer.setMemberType("Silver");
        System.out.println(customer);
        Visit visit = new Visit(customer,"12/2/2017");
        visit.setProductExpense(15);
        visit.setServiceExpense(30);
        System.out.println(visit);
        System.out.println("total: " + visit.totalExpense());
    }
}
