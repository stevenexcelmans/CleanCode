package domain.customers;

import domain.loyaltycards.LoyaltyCard;

public class Customer {

    private int customerID;
    private String firstName;
    private String lastName;

    private LoyaltyCard loyaltyCard;

    public Customer(int customerID, String firstName, String lastName) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LoyaltyCard getLoyaltyCard(String barcode){
        return loyaltyCard;
    }
}