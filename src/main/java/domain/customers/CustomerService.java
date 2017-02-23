package domain.customers;

import domain.loyaltycards.LoyaltyCard;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CustomerService {

    @Inject
    private CustomerRepository customerRepository;

    public void addCustomer(int customerID, String firstName, String lastName){
        Customer customer = new Customer(customerID, firstName ,lastName);
        customerRepository.addCustomer(customer);
    }

    public Iterable<Customer> getAllCustomers(){
    return customerRepository.getCustomers();
    }

    public Customer findByLoyaltyCardBarcode(String barcode){
        return customerRepository.findByLoyaltyCardBarcode(barcode);
    }
}


