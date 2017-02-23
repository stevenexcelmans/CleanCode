package domain.customers;

import domain.shoppingcart.Item;

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

    public HashSet<Item> items = new HashSet<>();

    public HashSet<Item> getItems() {
        return items;
    }

    public void addItem (Item item) {
        items.add(item);
    }

    public Item savsaveGroceriesByDate (String date) {
        for (Item item : items) {
            if (item.getDate().equals(date)) {
                return item;
            }
        }
        return null;
    }
}
