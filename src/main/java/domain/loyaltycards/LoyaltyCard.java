package domain.loyaltycards;

public class LoyaltyCard {

    private String loyaltyCardID;
    private String barcode;
    private long bonusPoints;

    public LoyaltyCard(){}

    public LoyaltyCard(String loyaltyCardID, String barcode, long bonusPoints) {
        this.loyaltyCardID = loyaltyCardID;
        this.barcode = barcode;
        this.bonusPoints = bonusPoints;
    }

    public String getLoyaltyCardID() {
        return loyaltyCardID;
    }

    public String getBarcode() {
        return barcode;
    }

    public long getBonusPoints() {
        return bonusPoints;
    }
}