package domain.shoppingcart;

import java.time.LocalDate;
import java.util.Collection;

/**
 * Created by sannev on 23/02/2017.
 */
public class Item  {
    private int itemId;
    private String itemName;
    private int price;
    private int timesBought;
    private LocalDate date;

    public Item(int itemId, LocalDate date) {
        this.itemId = itemId;
        this.date = date;
        this.timesBought =0;
    }

    public Item(int itemId, String itemName, int price, LocalDate date, int timesBought) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.date = date;
        this.timesBought = timesBought;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getTimesBought()
    {
        return this.timesBought;
    }
}
