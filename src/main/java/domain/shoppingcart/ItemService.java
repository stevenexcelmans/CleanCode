package domain.shoppingcart;

import domain.customers.Customer;
import domain.customers.CustomerRepository;

import javax.inject.Inject;

/**
 * Created by sannev on 23/02/2017.
 */
public class ItemService {

    @Inject
    private CustomerRepository customerRepository;

    public void addItem (String itemId, String itemName, int price, String date){
        Item item = new Item(itemId, itemName, price, date);
        customerRepository.addItem(item);
    }

    public Iterable<Item> getAllItems(){
        return customerRepository.getItems();
    }

    public Item saveGroceriesByDate(String date) {
     return customerRepository.savsaveGroceriesByDate(date);
    }
}


