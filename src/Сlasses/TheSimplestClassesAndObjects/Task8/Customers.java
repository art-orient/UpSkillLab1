package Сlasses.TheSimplestClassesAndObjects.Task8;

import java.util.ArrayList;

public class Customers {
    private ArrayList<Customer> customers;

    public Customers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public Customers() {
        customers = new ArrayList<Customer>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();
        for (Customer customer : customers) {
            output.append(customer).append("\n");
        }
        return output.toString();
    }

    public void getCreditCard(long min, long max){
        ArrayList<Customer> sample = new ArrayList<Customer>();
        for (Customer customer : customers) {
            if (customer.getCreditCard() >= min && customer.getCreditCard() <= max){
                sample.add(customer);
            }
        }
        StringBuilder output = new StringBuilder();
        for (Customer customer : sample) {
            output.append(customer).append("\n");
        }
        System.out.println(output);
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
}
