package domain.customers;

import domain.loyaltycards.LoyaltyCard;

public class Customer {

    private String customerID;
    private String firstName;
    private String lastName;

    private LoyaltyCard loyaltyCard;

    public Customer(String customerID, String firstName, String lastName) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getCustomerID() {
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