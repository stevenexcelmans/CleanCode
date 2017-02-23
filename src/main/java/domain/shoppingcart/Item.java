package domain.shoppingcart;

/**
 * Created by sannev on 23/02/2017.
 */
public class Item {
    private String itemId;
    private String itemName;
    private int price;
    private String date;

    public Item(String itemId, String itemName, int price, String date) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.date = date;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }
}
