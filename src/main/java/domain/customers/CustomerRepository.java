package domain.customers;

import domain.loyaltycards.LoyaltyCard;
import org.springframework.stereotype.Controller;

import javax.inject.Named;
import java.util.HashSet;

@Named
public class CustomerRepository {

    private HashSet<Customer> customers = new HashSet<Customer>();

    public HashSet<Customer> getCustomers(){
        return customers;
    }

    public void addCustomer (Customer customer){
        customers.add(customer);
    }

    public Customer findByLoyaltyCardBarcode(String barcode){
        for (Customer customer : customers){
            if (customer.getLoyaltyCard(barcode).equals(barcode)){
                return customer;
            }
        }
        return null;
    }
}