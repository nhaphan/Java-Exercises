package visit;

import customer.Customer;
import discount.DiscountRate;

public class Visit {
    private Customer customer;
    private String date;

    private double serviceExpense;
    private double productExpense;

    public Visit(Customer name, String date) {
        this.customer = name;
        this.date = date;
    }
    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense += serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense += productExpense;
    }
    public double totalExpense() {
        return  (serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType())));
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date='" + date + '\'' +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
